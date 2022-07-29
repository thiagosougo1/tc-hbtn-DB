package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name="Telefone")
public class Telefone {

    @Id
    private long id;

    @Column
    private String DDD;
    private String numero;

    public Telefone(){

    }
    public Telefone(long id, String DDD, String numero) {
        this.id = id;
        this.DDD = DDD;
        this.numero = numero;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDDD() {
        return DDD;
    }

    public void setDDD(String DDD) {
        this.DDD = DDD;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
