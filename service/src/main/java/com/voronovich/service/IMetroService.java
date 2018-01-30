package com.voronovich.service;

import com.voronovich.model.Metro;
import com.voronovich.service.exception.ServiceException;

import java.io.Serializable;

public interface IMetroService {

    /**
     * Method saves metro
     *
     * @param metro Metro
     */
    void save(Metro metro) throws ServiceException;

    /**
     * Method updates metro
     *
     * @param metro Metro
     */
    void update(Metro metro) throws ServiceException;

    /**
     * Method removes metro from database
     *
     * @param metro Metro
     */
    void delete(Metro metro) throws ServiceException;

    /**
     * Method gets metro by it's id
     *
     * @param id metro ID
     * @return metro Metro
     */
    Metro get(Serializable id) throws ServiceException;
}
