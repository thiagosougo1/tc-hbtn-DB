package models;

public class PessoaModel {

    public void create(Produto p) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
        EntityManager em = emf.createEntityManager();

        try {
            System.out.println("Iniciando a transação");
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
            System.out.println("Pessoa criada com sucesso !!!");
        } catch (Exception e) {
            em.close();
            System.err.println("Erro ao criar pessoa !!!" + e.getMessage());
        } finally {
            em.close();
            System.out.println("Finalizando a transação");
        }
    }


    public void update(Pessoa p) {
        //TODO
    }

    public void delete(Pessoa p) {
        //TODO
    }

    public Produto findById(Pessoa p) {
        //TODO
        return null;
    }

    public List<Pessoa> findAll() {

        List<Pessoa> pessoa = new ArrayList<Pessoa>();
        //TODO
        return null;
    }
}
