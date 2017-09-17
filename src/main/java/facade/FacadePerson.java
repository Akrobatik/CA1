/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import entities.Info;
import entities.Person;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Rasmussen
 */
public class FacadePerson implements InterfaceFacadePerson {
    
        EntityManagerFactory emf;


    public FacadePerson() {
    }
    
    @Override
    public void addEntityManagerFactory(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    @Override
    public Info getId(int id) {
        EntityManager em = emf.createEntityManager();
        
        try
        {
            Info i = em.find(Info.class, id);
            return em.find(Info.class, id);
            
        }
        finally
        {
            em.close();
        }
    }

    @Override
    public List<Person> getPersons() {
        EntityManager em = emf.createEntityManager();
        
        List<Person> persons;
        
        try
        {
            persons = em.createQuery("SELECT p FROM Person p").getResultList();
        }
        finally
        {
            em.close();
        }
        
        return persons;
    }

    @Override
    public Info deletePerson(int id) {
        
        EntityManager em = emf.createEntityManager();

        try
        {
            em.getTransaction().begin();
            Info i = em.find(Info.class, id);
            em.remove(i);
            em.getTransaction().commit();
            return i;
        }
        finally
        {
            em.close();
        }
    }
//      Fik ikke til at virke
//    @Override
//    public Person getPerson(int Phone) {
//        EntityManager em = emf.createEntityManager();
//        
//        String persons;
//        
//        try
//        {
//            persons = em.createQuery("SELECT p FROM Person p");
//        }
//        finally
//        {
//            em.close();
//        }
//        
//        return persons;
//    }
//    
}
