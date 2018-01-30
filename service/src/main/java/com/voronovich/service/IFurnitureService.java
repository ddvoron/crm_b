package com.voronovich.service;

import com.voronovich.model.Furniture;
import com.voronovich.service.exception.ServiceException;

import java.io.Serializable;

public interface IFurnitureService {

    /**
     * Method saves furniture
     *
     * @param furniture Furniture
     */
    void save(Furniture furniture) throws ServiceException;

    /**
     * Method updates furniture
     *
     * @param furniture Furniture
     */
    void update(Furniture furniture) throws ServiceException;

    /**
     * Method removes furniture from database
     *
     * @param furniture Furniture
     */
    void delete(Furniture furniture) throws ServiceException;

    /**
     * Method gets furniture by it's id
     *
     * @param id furniture ID
     * @return furniture Furniture
     */
    Furniture get(Serializable id) throws ServiceException;
}
