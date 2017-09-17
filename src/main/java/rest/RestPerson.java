
package rest;

import com.google.gson.Gson;
import deploy.DeploymentConfiguration;
import entities.Info;
import entities.Person;
import facade.FacadePerson;
import java.util.List;
import javax.persistence.Persistence;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Runej
 */
@Path("person")
public class RestPerson {
    
    private FacadePerson fp;
    private Gson gson;

    @Context
    private UriInfo context;

  
    public RestPerson() {
        fp = new FacadePerson();
        fp.addEntityManagerFactory(Persistence.createEntityManagerFactory(DeploymentConfiguration.PU_NAME));
        gson = new Gson();   
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
       return "Hej fra RestPersons getMetode()";
    }

    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public String getPerson(@PathParam("id") int id)
    {
        Info i = fp.getId(id);

        if(i != null)
        {
            return new Gson().toJson(i);
        }
        
        return "{}";
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/all")
    public String getPersons()
    {
        List<Person> persons = fp.getPersons();
        
        return new Gson().toJson(persons);
       
    }
    
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public String deletePerson(@PathParam("id") int id)
    {
        Info i = fp.deletePerson(id);
        
        return new Gson().toJson(i);
    }
        
}
