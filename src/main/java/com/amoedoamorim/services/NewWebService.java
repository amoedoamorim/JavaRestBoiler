package com.amoedoamorim.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import org.springframework.stereotype.Service;

@Service
@Path("/newservice")
public class NewWebService {
    @GET
    @Produces("text/plain")
    public String hello(@QueryParam("budget") final Long idBudget) {
        return "Hello World";    
    }
}