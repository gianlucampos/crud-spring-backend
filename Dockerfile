FROM maven:3.6.3-jdk-11-slim AS build
RUN mkdir -p /workspace
WORKDIR /workspace
COPY pom.xml /workspace
COPY src /workspace/src
RUN mvn clean install -DskipTests

FROM openjdk:14-alpine
COPY --from=build /workspace/target/*.jar crud-react-backend-0.0.1-SNAPSHOT.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","crud-react-backend-0.0.1-SNAPSHOT.jar"]