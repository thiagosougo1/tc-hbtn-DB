package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name="Aluno")
public class Aluno {

    @Id
    private long id;

    @Column
    private String nomeCompleto;

    @Column
    private String matricula;

    @Column
    private String email;

    @Column
    private String nascimento;

    public Aluno() {
    }

    public Aluno(long id, String nomeCompleto, String matricula, String nascimento, String email) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.matricula = matricula;
        this.nascimento = nascimento;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getEmail() {
        return email;
    }
}
