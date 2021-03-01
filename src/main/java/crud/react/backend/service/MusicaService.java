package crud.react.backend.service;

import crud.react.backend.model.Album;
import crud.react.backend.model.Artista;
import crud.react.backend.model.Musica;
import crud.react.backend.repository.AlbumRepository;
import crud.react.backend.repository.ArtistaRepository;
import crud.react.backend.repository.MusicaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public List<Musica> findAll() {
        return musicaRepository.findAll();
    }

    public Musica createMusica(Musica musica) {
        return musicaRepository.save(musica);
    }

    public Musica retrieveMusicaById(Long id) {
        return musicaRepository.findById(id).get();
    }

    public void deleteMusica(Musica musica) {
        musicaRepository.delete(musica);
    }

    //Artista
    public Artista createArtista(Artista artista) {
        return artistaRepository.save(artista);
    }

    //Album
    public Album createAlbum(Album album) {
        return albumRepository.save(album);
    }

}
