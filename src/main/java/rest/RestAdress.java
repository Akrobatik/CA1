/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Rune
 */
@Path("address")
public class RestAdress {

    @Context
    private UriInfo context;

  
    public RestAdress() {
    }

   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
       return ("Hej fra RestAdress getMetode()");
    }

    /**
     * PUT method for updating or creating an instance of RestAdress
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
