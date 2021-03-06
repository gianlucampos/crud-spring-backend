package crud.react.backend.repository;

import crud.react.backend.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author gianlucampos
 */
public interface AlbumRepository extends JpaRepository<Album, Long> {

    @Query("SELECT artista.albums FROM Artista artista where artista.id = :artistaId")
    List<Album> findAlbunsByArtista(@Param("artistaId") Long idArtista);

}
