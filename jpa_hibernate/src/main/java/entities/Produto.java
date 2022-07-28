
@Entity
@Table(name="produto")
public class Produto {

    @Id
    private int id;

    @Column
    private String nome;

    @Column
    private int quantidade;

    @Column
    private double preco;

    @Column
    private String status;
}
