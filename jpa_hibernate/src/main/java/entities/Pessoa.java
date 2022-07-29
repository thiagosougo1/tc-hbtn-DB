package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name="Pessoa")
public class Pessoa implements Serializable {

    public Pessoa(){

    }

    @Id
    private int id;

    @Column
    private String nome;

    @Column
    private int idade;

    @Column
    private String email;

    @Column
    private String cpf;

    @Column
    private String dataNascimento;
}
