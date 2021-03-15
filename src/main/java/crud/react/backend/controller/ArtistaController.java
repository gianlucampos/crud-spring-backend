package crud.react.backend.controller;

import crud.react.backend.service.MusicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author gianlucampos
 */
@CrossOrigin(origins = "https://gianlucampos.github.io/crud-react-frontend/")
@RestController
@RequestMapping("/artistas")
public class ArtistaController {

    @Autowired
    private MusicaService service;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(service.findAllArtistas());
    }

    @GetMapping("/{id}/albums")
    public ResponseEntity<?> findAlbumByArtista(@PathVariable Long id){
        return ResponseEntity.ok(service.findAlbunsByArtista(id));
    }

}
