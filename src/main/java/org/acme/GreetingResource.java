package org.acme;

import java.util.List;

import io.smallrye.common.annotation.NonBlocking;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/person")
    public List<Person> listAll() {
        return Person.listAll();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @NonBlocking
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }
}
