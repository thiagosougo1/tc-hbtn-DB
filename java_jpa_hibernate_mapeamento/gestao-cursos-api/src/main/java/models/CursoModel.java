package models;

import entities.Curso;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class CursoModel {
    public void create(Curso curso) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestao-cursos-jpa");
        EntityManager em = emf.createEntityManager();
        try {
            System.out.println("Iniciando a transação");
            em.getTransaction().begin();
            em.persist(curso);
            em.getTransaction().commit();
            System.out.println("Curso criado com sucesso !!!");
        } catch (Exception e) {
            em.close();
            System.err.println("Erro ao criar curso !!!" + e.getMessage());
        } finally {
            em.close();
            System.out.println("Finalizando a transação");
        }
    }

    public Curso findById(Curso id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestao-cursos-jpa");
        EntityManager em = emf.createEntityManager();
        Curso pessoaBuscado = em.find(Curso.class, id);
        return pessoaBuscado;
    }

    public List<Curso> findAll() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestao-cursos-jpa");
        EntityManager em = emf.createEntityManager();
        return em.createQuery("FROM " +
                Curso.class.getName()).getResultList();
    }
    public void update(Curso curso) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestao-cursos-jpa");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Curso atualizacao = em.merge(curso);
        em.getTransaction().commit();
    }

    public void delete(Curso curso) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestao-cursos-jpa");
        EntityManager em = emf.createEntityManager();
        Curso produtoBuscado = em.find(Curso.class, curso);
        em.getTransaction().begin();
        em.remove(curso);
        em.getTransaction().commit();
    }
}