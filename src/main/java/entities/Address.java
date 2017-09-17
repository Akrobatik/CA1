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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.ws.rs.Path;

/**
 *
 * @author Runej
 */
@Entity

public class Address implements Serializable {

   

    public Address() {
    }

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String street;
    private String additionalinfo;
    
     @OneToMany(mappedBy = "address")
     private List<Info> info = new ArrayList();
     
    
    @ManyToOne
     private CityInfo cityInfo;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the additionalinfo
     */
    public String getAdditionalinfo() {
        return additionalinfo;
    }

    /**
     * @param additionalinfo the additionalinfo to set
     */
    public void setAdditionalinfo(String additionalinfo) {
        this.additionalinfo = additionalinfo;
    }

   
    
}
