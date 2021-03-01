package crud.react.backend.repository;

import crud.react.backend.model.Artista;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author gianlucampos
 */
public interface ArtistaRepository extends JpaRepository<Artista, Long> {

}
