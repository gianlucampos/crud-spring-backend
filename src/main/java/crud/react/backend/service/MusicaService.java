package crud.react.backend.service;

import crud.react.backend.model.Album;
import crud.react.backend.model.Artista;
import crud.react.backend.model.Musica;
import crud.react.backend.repository.AlbumRepository;
import crud.react.backend.repository.ArtistaRepository;
import crud.react.backend.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author gianlucampos
 */
@Service
public class MusicaService {

    @Autowired
    private MusicaRepository musicaRepository;
    @Autowired
    private ArtistaRepository artistaRepository;
    @Autowired
    private AlbumRepository albumRepository;

    public List<Musica> findAllMusicas() {
        return musicaRepository.findAll();
    }

    public Musica saveMusica(Musica musica) {
        return musicaRepository.save(musica);
    }

    public Musica retrieveMusicaById(Long id) {
        return musicaRepository.findById(id).orElse(null);
    }

    public void deleteMusica(Musica musica) {
        musicaRepository.delete(musica);
    }

    //Artista
    public Artista saveArtista(Artista artista) {
        return artistaRepository.save(artista);
    }

    public List<Artista> findAllArtistas() {
        return artistaRepository.findAll();
    }

    //Album
    //@POST albums
    public Album saveAlbum(Album album) {
        return albumRepository.save(album);
    }

    //@GET albums/{artista}
    public List<Album> findAlbunsByArtista(Long idArtista) {
        return albumRepository.findAlbunsByArtista(idArtista);
    }

}
