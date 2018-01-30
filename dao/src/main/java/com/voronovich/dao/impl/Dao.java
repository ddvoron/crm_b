package com.voronovich.dao.impl;

import com.voronovich.dao.IDao;
import com.voronovich.exception.DaoException;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

@Repository
public class Dao<T> implements IDao<T> {

    private static Logger log = Logger.getLogger(Dao.class);
    private SessionFactory sessionFactory;

    public Dao(){
    }

    @Autowired
    public Dao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public int save(T t) throws DaoException {
        try {
            log.info("Save: " + t);
            return (Integer)getSession().save(t);
        } catch (HibernateException e) {
            log.error("Error save Object in Dao " + e);
            throw new DaoException(e);
        }
    }

    @Override
    public void update(T t) throws DaoException {
        try {
            getSession().update(t);
            log.info("Update: " + t);
        } catch (HibernateException e) {
            log.error("Error update Object in Dao " + e);
            throw new DaoException(e);
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get(Serializable id) throws DaoException {
        T t = null;
        try {
            t = (T) getSession().get(getPersistentClass(), id);
        } catch (HibernateException e) {
            log.error("Error get " + getPersistentClass() + " in Dao " + e);
            throw new DaoException(e);
        }
        return t;
    }

    @Override
    public void delete(T t) throws DaoException {
        try {
            getSession().delete(t);
            log.info("Delete: " + t);
        } catch (HibernateException e) {
            log.error("Error save or update Object in Dao " + e);
            throw new DaoException(e);
        }
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    private Class getPersistentClass() {
        return (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }
}