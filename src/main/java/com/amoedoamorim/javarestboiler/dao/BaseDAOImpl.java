package com.amoedoamorim.javarestboiler.dao;

import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import org.hibernate.Criteria;
import org.hibernate.Session;

public abstract class BaseDAOImpl<K, E> implements BaseDAO<K, E> {

    protected Class<E> entityClass;
    protected EntityManager entityManager;

    @SuppressWarnings("unchecked")
    public BaseDAOImpl() {
        final ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
        this.entityClass = ((Class<E>) type.getActualTypeArguments()[1]);
    }

    @Override
    public void add(final E entity) {
        this.entityManager.persist(entity);
    }

    @Override
    public void update(final E entity) {
        this.entityManager.merge(entity);
    }

    @Override
    public void delete(final E entity) {
        this.entityManager.remove(entity);
    }

    @Override
    public E getById(final K id) {
        final E entity = this.entityManager.find(this.entityClass, id);

        if (entity == null) {
            throw new NoResultException();
        }

        return entity;
    }

    @Override
    public Criteria getCriteria() {
        final Session session = (Session) this.entityManager.getDelegate();
        final Criteria criteria = session.createCriteria(this.entityClass);

        return criteria;
    }
}
