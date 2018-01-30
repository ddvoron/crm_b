package com.voronovich.service;

import com.voronovich.model.Options;
import com.voronovich.service.exception.ServiceException;

import java.io.Serializable;

public interface IOptionsService {

    /**
     * Method saves Options
     *
     * @param options Options
     */
    int save(Options options) throws ServiceException;

    /**
     * Method updates options
     *
     * @param options Options
     */
    void update(Options options) throws ServiceException;

    /**
     * Method removes options from database
     *
     * @param options Options
     */
    void delete(Options options) throws ServiceException;

    /**
     * Method gets options by it's id
     *
     * @param id options ID
     * @return options Options
     */
    Options get(Serializable id) throws ServiceException;
}
