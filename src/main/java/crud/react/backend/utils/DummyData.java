package crud.react.backend.utils;

import crud.react.backend.enumeration.Genero;
import crud.react.backend.model.Album;
import crud.react.backend.model.Artista;
import crud.react.backend.service.MusicaService;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author gianlucampos
 */
@Component
public class DummyData {

    @Autowired
    private MusicaService musicaService;

//    @PostConstruct
    public void populaBanco() {
        Artista artista = new Artista();
        artista.setNome("Red Hot Chili Peppers");
        artista.setGenero(Genero.FUNKY);
        musicaService.createArtista(artista);

        Album album = new Album();
        album.setTitulo("Stadium Arcadium");
        album.setAnoLancamento(2006);
        album.setCapa(null);
        musicaService.createAlbum(album);

        artista = new Artista();
        artista.setNome("Blink-182");
        artista.setGenero(Genero.PUNK);
        musicaService.createArtista(artista);

        album = new Album();
        album.setTitulo("The Enema of State");
        album.setAnoLancamento(1999);
        album.setCapa(null);
        musicaService.createAlbum(album);
    }

}
