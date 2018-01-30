package com.voronovich.service;

import com.voronovich.model.Advertising;
import com.voronovich.service.exception.ServiceException;

import java.io.Serializable;

public interface IAdvertisingService {

    /**
     * Method saves Advertising
     *
     * @param advertising Advertising
     */
    int save(Advertising advertising) throws ServiceException;

    /**
     * Method updates advertising
     *
     * @param advertising Advertising
     */
    void update(Advertising advertising) throws ServiceException;

    /**
     * Method removes advertising from database
     *
     * @param advertising Advertising
     */
    void delete(Advertising advertising) throws ServiceException;

    /**
     * Method gets advertising by it's id
     *
     * @param id advertising ID
     * @return advertising Advertising
     */
    Advertising get(Serializable id) throws ServiceException;
}
