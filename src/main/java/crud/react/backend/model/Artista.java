package crud.react.backend.model;

import crud.react.backend.enumeration.Genero;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
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

}
