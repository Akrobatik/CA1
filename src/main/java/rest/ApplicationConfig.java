/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Runej
 */
@javax.ws.rs.ApplicationPath("api")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

   
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(rest.RestAdress.class);
        resources.add(rest.RestCityInfo.class);
        resources.add(rest.RestCompany.class);
        resources.add(rest.RestHobby.class);
        resources.add(rest.RestInfo.class);
        resources.add(rest.RestPerson.class);
        resources.add(rest.RestPhone.class);
    }
    
}
