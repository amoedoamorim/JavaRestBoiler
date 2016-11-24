package com.amoedoamorim.javarestboiler.dao;

import org.hibernate.Criteria;

public interface BaseDAO<K, E> {
    public void add(E entity);

    public void update(E entity);

    public void delete(E entity);

    public E getById(K id);

    public Criteria getCriteria();
}
