package entities;

@Entity
@Table(name="pessoa")
public class Pessoa {

    @Id
    private int id;

    @Column
    private String NOME;

    @Column
    private String email;

    @Column
    private String cpf;

    @Column
    private String dataNascimento;
}
