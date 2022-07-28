package entities;

@Entity
@Table(name="pessoa")
public class Pessoa {

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
