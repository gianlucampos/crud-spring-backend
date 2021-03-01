package crud.react.backend.repository;

import crud.react.backend.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author gianlucampos
 */
public interface MusicaRepository extends JpaRepository<Musica, Long> {

}
