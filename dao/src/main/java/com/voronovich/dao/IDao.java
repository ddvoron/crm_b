package com.voronovich.dao;

import com.voronovich.exception.DaoException;

import java.io.Serializable;

/**
 * Common abstract methods for every dao model layer
 *
 * @param <T> Entity
 * @author Dmitry V
 * @version 1.0
 */
public interface IDao<T> {

    /**
     * Method saves model
     *
     * @param t model
     * @throws DaoException
     */
    int save(T t) throws DaoException;

    /**
     * Method updates model
     *
     * @param t model
     * @throws DaoException
     */
    void update(T t) throws DaoException;

    /**
     * Method deletes model
     *
     * @param t model
     * @throws DaoException
     */
    void delete(T t) throws DaoException;

    /**
     * Method reads model
     *
     * @param id - model id
     * @return Entity
     * @throws DaoException
     */
    T get(Serializable id) throws DaoException;
}