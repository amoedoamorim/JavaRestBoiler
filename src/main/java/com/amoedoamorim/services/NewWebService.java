package com.amoedoamorim.services;

import com.amoedoamorim.javarestboiler.model.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import org.springframework.stereotype.Service;

@Service
@Path("/newservice")
public class NewWebService {
    @GET
    @Produces("application/json;charset=UTF-8")
    public Response hello(@QueryParam("budget") final Long idBudget) {
        return Response.ok(new Student()).build();
    }
}