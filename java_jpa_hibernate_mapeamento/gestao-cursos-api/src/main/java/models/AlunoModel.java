package models;

import entities.Aluno;
import javax.persistence.*;
import java.util.*;

public class AlunoModel {

    public static void create(Aluno aluno) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestao-cursos-jpa");
        EntityManager em = emf.createEntityManager();

        try {
            System.out.println("Iniciando a transação");
            em.getTransaction().begin();
            em.persist(aluno);
            em.getTransaction().commit();
            System.out.println("Aluno criado com sucesso !!!");
        } catch (Exception e) {
            em.close();
            System.err.println("Erro ao criar um aluno !!!" + e.getMessage());
        } finally {
            em.close();
            System.out.println("Finalizando a transação");
        }
    }

    public Aluno findById(Long id) {
        // TODO
        return null;
    }

    public static List<Aluno> findAll() {
        // TODO
        return null;
    }

    public void update(Aluno aluno) {
        // TODO
    }

    public void delete(Aluno aluno) {
        // TODO
    }
}