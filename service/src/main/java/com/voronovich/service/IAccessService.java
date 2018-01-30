package com.voronovich.service;

import com.voronovich.model.Access;
import com.voronovich.service.exception.ServiceException;

import java.io.Serializable;

public interface IAccessService {

    /**
     * Method saves access
     *
     * @param access Access
     */
    void save(Access access) throws ServiceException;

    /**
     * Method updates access
     *
     * @param access Access
     */
    void update(Access access) throws ServiceException;

    /**
     * Method removes access from database
     *
     * @param access Access
     */
    void delete(Access access) throws ServiceException;

    /**
     * Method gets access by it's id
     *
     * @param id access ID
     * @return access Access
     */
    Access get(Serializable id) throws ServiceException;
}
