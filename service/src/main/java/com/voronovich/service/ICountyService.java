package com.voronovich.service;

import com.voronovich.model.County;
import com.voronovich.service.exception.ServiceException;

import java.io.Serializable;

public interface ICountyService {

    /**
     * Method saves county
     *
     * @param county County
     */
    void save(County county) throws ServiceException;

    /**
     * Method updates county
     *
     * @param county County
     */
    void update(County county) throws ServiceException;

    /**
     * Method removes county from database
     *
     * @param county County
     */
    void delete(County county) throws ServiceException;

    /**
     * Method gets county by it's id
     *
     * @param id county ID
     * @return county County
     */
    County get(Serializable id) throws ServiceException;
}
