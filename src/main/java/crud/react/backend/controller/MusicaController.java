package crud.react.backend.controller;

import crud.react.backend.model.Musica;
import crud.react.backend.service.MusicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author gianlucampos
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/musicas")
public class MusicaController {

    @Autowired
    private MusicaService service;

    //Buscar todas musicas
    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(service.findAllMusicas());
    }

    //Salvar musica
    @PostMapping
    public ResponseEntity<?> create(@RequestBody Musica musica) {
        return ResponseEntity.ok(service.saveMusica(musica));
    }

    //Buscar pelo musica pelo id
    @GetMapping("/{id}")
    public ResponseEntity<?> retrieveById(@PathVariable Long id) {
        return ResponseEntity.ok(service.retrieveMusicaById(id));
    }

    //Atualizar musica
    @PutMapping
    public ResponseEntity<?> update(@RequestBody Musica musicaDTO) {
        Musica musica = service.retrieveMusicaById(musicaDTO.getId());
        musica.setNome(musicaDTO.getNome());
        musica.setAlbum(musicaDTO.getAlbum());
        musica.setArtista(musicaDTO.getArtista());
        return ResponseEntity.ok(service.saveMusica(musica));
    }

    //Deletar musica
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        Musica musica = service.retrieveMusicaById(id);
        service.deleteMusica(musica);
        return ResponseEntity.ok("Removido com sucesso");
    }
}
