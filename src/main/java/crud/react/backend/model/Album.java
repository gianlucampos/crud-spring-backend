package crud.react.backend.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author gianlucampos
 */
@Entity
public class Album implements Serializable {

    @Id
    @SequenceGenerator(name = "seqalbum", sequenceName = "seqalbum", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seqalbum")
    private Long id;
    @Column
    private String titulo;
    @Column
    private Integer anoLancamento;
    @Column
    private Byte[] capa;

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

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Byte[] getCapa() {
        return capa;
    }

    public void setCapa(Byte[] capa) {
        this.capa = capa;
    }
    
}
