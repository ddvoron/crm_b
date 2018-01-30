package com.voronovich.service;

import com.voronovich.model.OwnType;
import com.voronovich.service.exception.ServiceException;

import java.io.Serializable;

public interface IOwnTypeService {

    /**
     * Method saves ownType
     *
     * @param ownType OwnType
     */
    void save(OwnType ownType) throws ServiceException;

    /**
     * Method updates ownType
     *
     * @param ownType OwnType
     */
    void update(OwnType ownType) throws ServiceException;

    /**
     * Method removes ownType from database
     *
     * @param ownType OwnType
     */
    void delete(OwnType ownType) throws ServiceException;

    /**
     * Method gets metro by it's id
     *
     * @param id ownType ID
     * @return ownType
     */
    OwnType get(Serializable id) throws ServiceException;
}
