package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name="Professor")
public class Professor {
    @Id
    private long id;

    @Column
    private String nomeCompleto;

    @Column
    private String matricula;

    @Column
    private String email;
    

    public Professor() {
    }

    public Professor(long id, String nomeCompleto, String matricula, String email) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.matricula = matricula;
        this.email = email;
    }
}
