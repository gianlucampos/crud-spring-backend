package crud.react.backend.service;

import crud.react.backend.model.Musica;
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
    private MusicaRepository repository;

    
    public List<Musica> findAll(){
        return repository.findAll();
    }
    
    public Musica createMusica(Musica musica){
        return repository.save(musica);
    }
    
    public Musica retrieveMusicaById(Long id){
        return repository.findById(id).get();
    }
    
    public void deleteMusica(Musica musica){
        repository.delete(musica);
    }
    
    
}
