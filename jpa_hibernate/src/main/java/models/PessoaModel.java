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
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Pessoa atualizacao = em.merge(p);
        em.getTransaction().commit();
    }

    public void delete(Pessoa p) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
        EntityManager em = emf.createEntityManager();
        Pessoa produtoBuscado = em.find(Pessoa.class, p);
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
    }

    public Produto findById(Pessoa p) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
        EntityManager em = emf.createEntityManager();
        Pessoa pessoaBuscado = em.find(Pessoa.class, p);
        return pessoaBuscado;
    }

    @SuppressWarnings("unchecked")
        public List<Pessoa> findAll() {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("admin-jpa");
            EntityManager em = emf.createEntityManager();
            return em.createQuery("FROM " +
                    Pessoa.class.getName()).getResultList();
        }
}
