package com.voronovich.service;

import com.voronovich.model.UserAccess;
import com.voronovich.service.exception.ServiceException;

import java.io.Serializable;

public interface IUserAccessService {

    /**
     * Method saves userAccess
     *
     * @param userAccess UserAccess
     */
    void save(UserAccess userAccess) throws ServiceException;

    /**
     * Method updates userAccess
     *
     * @param userAccess UserAccess
     */
    void update(UserAccess userAccess) throws ServiceException;

    /**
     * Method removes userAccess from database
     *
     * @param userAccess UserAccess
     */
    void delete(UserAccess userAccess) throws ServiceException;

    /**
     * Method gets userAccess by it's id
     *
     * @param id userAccess ID
     * @return userAccess UserAccess
     */
    UserAccess get(Serializable id) throws ServiceException;
}
