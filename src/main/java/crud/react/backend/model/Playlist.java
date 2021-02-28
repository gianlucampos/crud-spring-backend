package crud.react.backend.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author gianlucampos
 */
@Entity
public class Playlist implements Serializable {

    @Id
    @SequenceGenerator(name = "seqplaylist", sequenceName = "seqplaylist", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seqplaylist")
    private Long id;
    @Column
    private String titulo;
    @Column
    private String descricao;
    @OneToMany
    @JoinColumn(name = "PLAYLISTID", referencedColumnName = "ID")
    private List<Musica> musicas = new ArrayList<>();

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }
    
}
