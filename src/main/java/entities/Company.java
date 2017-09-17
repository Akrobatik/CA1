/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author Runej
 */
@Entity
public class Company extends Info implements Serializable {

    public Company() {
       
    }    

    private int cvr;
    private String name;
    private String description;
    private int numEmployees;
    private int marketValue;

    
    public int getCvr() {
        return cvr;
    }

    /**
     * @param cvr the cvr to set
     */
    public void setCvr(int cvr) {
        this.cvr = cvr;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the numEmployees
     */
    public int getNumEmployees() {
        return numEmployees;
    }

    /**
     * @param numEmployees the numEmployees to set
     */
    public void setNumEmployees(int numEmployees) {
        this.numEmployees = numEmployees;
    }

    /**
     * @return the marketValue
     */
    public int getMarketValue() {
        return marketValue;
    }

    /**
     * @param marketValue the marketValue to set
     */
    public void setMarketValue(int marketValue) {
        this.marketValue = marketValue;
    }

    
    
}
