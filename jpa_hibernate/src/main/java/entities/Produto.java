package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Produto")
public class Produto {

    public Produto(){

    }

    @Id
    private int id;

    @Columns
    private String nome;

    @Column
    private int quantidade;

    @Column
    private double preco;

    @Column
    private String status;
}
