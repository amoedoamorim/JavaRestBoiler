package com.amoedoamorim.services;

import com.amoedoamorim.javarestboiler.dao.ContatoDAO;
import com.amoedoamorim.javarestboiler.dao.ContatoDAOImpl;
import com.amoedoamorim.javarestboiler.dao.persistence.PersistenceUtil;
import com.amoedoamorim.javarestboiler.model.*;
import javax.persistence.EntityManager;
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
    public Response hello(@QueryParam("id") final Long idContato) {
        
        EntityManager em = PersistenceUtil.getEntityManager();
        
        ContatoDAO contatoDAO = new ContatoDAOImpl(em);
        
        Contato contato = contatoDAO.getById(idContato);
        
        return Response.ok(contato).build();
    }
}