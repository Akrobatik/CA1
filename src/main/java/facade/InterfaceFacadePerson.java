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
public interface InterfaceFacadePerson {
    public void addEntityManagerFactory(EntityManagerFactory emf);        
    public EntityManager getEntityManager();
    public Info getId(int id);
    //public Person getPerson(int Phone); Virker ikke
    public List<Person> getPersons();
    public Info deletePerson(int id);


}
