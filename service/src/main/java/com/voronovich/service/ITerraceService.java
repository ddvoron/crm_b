package com.voronovich.service;

import com.voronovich.model.Terrace;
import com.voronovich.service.exception.ServiceException;

import java.io.Serializable;

public interface ITerraceService {

    /**
     * Method saves terrace
     *
     * @param terrace Terrace
     */
    void save(Terrace terrace) throws ServiceException;

    /**
     * Method updates terrace
     *
     * @param terrace Terrace
     */
    void update(Terrace terrace) throws ServiceException;

    /**
     * Method removes terrace from database
     *
     * @param terrace Terrace
     */
    void delete(Terrace terrace) throws ServiceException;

    /**
     * Method gets terrace by it's id
     *
     * @param id terrace ID
     * @return terrace Terrace
     */
    Terrace get(Serializable id) throws ServiceException;
}
