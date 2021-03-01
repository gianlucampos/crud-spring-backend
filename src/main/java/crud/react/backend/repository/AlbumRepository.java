package crud.react.backend.repository;

import crud.react.backend.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author gianlucampos
 */
public interface AlbumRepository extends JpaRepository<Album, Long> {

}
