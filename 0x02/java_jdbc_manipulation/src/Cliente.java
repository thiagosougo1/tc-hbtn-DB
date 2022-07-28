public class Cliente {
    private int id;
    private String nome;
    private int idade;
    private String cpf;
    private String rg;

    public Cliente(int id, String nome, int idade, String cpf, String rg) {
        setId(id);
        setNome(nome);
        setIdade(idade);
        setCpf(cpf);
        setRg(rg);
    }

    public Cliente(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
