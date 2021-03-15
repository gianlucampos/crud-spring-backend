package crud.react.backend.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 * @author gianlucampos
 */
@Entity
public class Playlist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "seqplaylist", sequenceName = "seqplaylist", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seqplaylist")
    private Long id;
    @Column
    private String titulo;
    @Column
    private String descricao;
    @OneToMany
    @JoinColumn(name = "PLAYLISTID", referencedColumnName = "ID",
            foreignKey = @ForeignKey(name = "fk_playlistid_musica"))
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
