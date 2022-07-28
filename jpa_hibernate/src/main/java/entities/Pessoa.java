package entities;

@Entity
@Table(name="pessoa")
public class Pessoa {
    @Id
    private int id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String cpf;

    @Column
    private String dataNascimento;
}
