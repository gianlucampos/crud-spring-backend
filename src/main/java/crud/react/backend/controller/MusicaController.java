package crud.react.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author gianlucampos
 */
@RestController
@RequestMapping("/musicas")
public class MusicaController {

    @GetMapping
    public ResponseEntity list() {
        return ResponseEntity.ok("Hello World");
    }

}
