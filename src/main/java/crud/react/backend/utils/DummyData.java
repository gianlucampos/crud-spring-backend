package crud.react.backend.utils;

import com.sun.istack.logging.Logger;
import crud.react.backend.enumeration.Genero;
import crud.react.backend.model.Album;
import crud.react.backend.model.Artista;
import crud.react.backend.model.Musica;
import crud.react.backend.service.MusicaService;
import java.util.logging.Level;
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

    @PostConstruct
    public void populaBanco() {
        if (!musicaService.findAll().isEmpty()) {
            Logger.getLogger(DummyData.class).log(Level.INFO, "Banco já populado");
            return;
        }
        Artista artista = new Artista();
        artista.setNome("Red Hot Chili Peppers");
        artista.setGenero(Genero.FUNKY);
        musicaService.createArtista(artista);

        Album album = new Album();
        album.setTitulo("Stadium Arcadium");
        album.setAnoLancamento(2006);
        album.setCapa(null);
        musicaService.createAlbum(album);

        Musica musica = new Musica();
        musica.setNome("Dani California");
        musica.setAlbum(album);
        musica.setArtista(artista);
        musicaService.createMusica(musica);

        musica = new Musica();
        musica.setNome("Snow (Hey Oh)");
        musica.setAlbum(album);
        musica.setArtista(artista);
        musicaService.createMusica(musica);

        artista = new Artista();
        artista.setNome("Blink-182");
        artista.setGenero(Genero.PUNK);
        musicaService.createArtista(artista);

        album = new Album();
        album.setTitulo("The Enema of State");
        album.setAnoLancamento(1999);
        album.setCapa(null);
        musicaService.createAlbum(album);
        Logger.getLogger(DummyData.class).log(Level.INFO, "Banco populado com sucesso!");
    }
}
