/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 *
 * @author Runej
 */
@Entity
public class Person extends Info implements Serializable {

  
    private String firstName;
    private String lastName;
    
    @ManyToMany
    private List <Hobby> hobbies = new ArrayList();
    

     public Person() {
    }
     

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

  @Override
  public  String toString(){
      
      return "Person{" + 
              "firstName='" + firstName + '\'' +
              ", lastName='" +  lastName + '\'' +
              ", hobbies=" + hobbies +
              "} " + super.toString();
  }


  
    
    
}
