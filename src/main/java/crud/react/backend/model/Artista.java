package crud.react.backend.model;

import crud.react.backend.enumeration.Genero;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author gianlucampos
 */
@Entity
public class Artista implements Serializable {

    @Id
    @SequenceGenerator(name = "seqartista", sequenceName = "seqartista", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seqartista")
    private Long id;
    @Column
    private String nome;
    @Column
    @Enumerated(EnumType.STRING)
    private Genero genero;
    @OneToMany
    @JoinColumn(name = "ARTISTAID", referencedColumnName = "ID",
            foreignKey = @ForeignKey(name = "fk_artistaid_album"))
    private List<Album> albums = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public void addAlbum(Album album) {
        this.albums.add(album);
    }

    public void removeAlbum(Album album) {
        this.albums.remove(album);
    }

}
