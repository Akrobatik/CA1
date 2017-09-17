/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import entities.Company;
import entities.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Runej
 */
public class Tester {
    
    public static void main(String[] args) {
// Persistence.generateSchema("PU", new HashMap());

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
        EntityManager em = emf.createEntityManager();
        
   
        
       
        Person p1 = new Person();
        p1.setLastName("Halvor");
        p1.setFirstName("Rune");
        p1.setEmail("Rune.Halvor@Yahoo.com");
        
        Person p2 = new Person();
        p2.setFirstName("Emil");
        p2.setLastName("Rasmussen");
        p2.setEmail("Emil@Rasmussen-Solutions.dk");
                
        Company c1 = new Company();
        c1.setCvr(38604147);
        
        
        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(c1);
       
      
        
        em.getTransaction().commit();
        em.close();
        emf.close();
       
        
        
        


    }
    
}
