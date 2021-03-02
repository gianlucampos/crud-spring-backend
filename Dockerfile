FROM maven:3.6.3-jdk-11-slim AS maven
COPY ./pom.xml ./pom.xml
RUN mvn dependency:go-offline -B
COPY ./src ./src
RUN mvn package -DskipTests

FROM openjdk:14-alpine
COPY --from=maven target/*.jar ./
EXPOSE 8082
ENTRYPOINT ["java","-jar","crud-react-backend-0.0.1-SNAPSHOT.jar"]