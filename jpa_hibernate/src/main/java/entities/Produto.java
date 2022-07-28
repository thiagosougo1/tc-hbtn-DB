package entities;

@Entity
@Table(name="produto")
public class Produto {

    @Id
    private int id;

    @Columns
    private String nome;

    @Column
    private int idade;

    @Column
    private int quantidade;

    @Column
    private double preco;

    @Column
    private String status;
}
