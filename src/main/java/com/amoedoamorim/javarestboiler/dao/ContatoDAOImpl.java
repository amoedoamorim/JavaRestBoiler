package com.amoedoamorim.javarestboiler.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.codehaus.jackson.jaxrs.JacksonJaxbJsonProvider;

import com.amoedoamorim.javarestboiler.model.Contato;
import com.amoedoamorim.javarestboiler.model.ContatoImpl;
import javax.persistence.EntityManager;

public class ContatoDAOImpl extends BaseDAOImpl<Long, ContatoImpl> implements ContatoDAO {

    List<Object> providers = null;

    public ContatoDAOImpl(final EntityManager em) {
        super.entityManager = em;
        this.providers = new ArrayList<Object>();
        this.providers.add(new JacksonJaxbJsonProvider());
    }
}
