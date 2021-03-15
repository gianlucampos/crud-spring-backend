package crud.react.backend.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author gianlucampos
 */
@Entity
public class Musica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "seqmusica", sequenceName = "seqmusica", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seqmusica")
    private Long id;
    @Column
    private String nome;
    @OneToOne
    @JoinColumn(name = "ARTISTAID", referencedColumnName = "ID", foreignKey = @ForeignKey(name = "fk_artistaid_musica"))
    private Artista artista;
    @OneToOne
    @JoinColumn(name = "ALBUMID", referencedColumnName = "ID", foreignKey = @ForeignKey(name = "fk_albumid_musica"))
    private Album album;

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

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

}
