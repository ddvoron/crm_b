package com.voronovich.service;

import com.voronovich.model.BathroomType;
import com.voronovich.service.exception.ServiceException;

import java.io.Serializable;

public interface IBathroomTypeService {

    /**
     * Method saves bathroomType
     *
     * @param bathroomType BathroomType
     */
    void save(BathroomType bathroomType) throws ServiceException;

    /**
     * Method updates bathroomType
     *
     * @param bathroomType BathroomType
     */
    void update(BathroomType bathroomType) throws ServiceException;

    /**
     * Method removes bathroomType from database
     *
     * @param bathroomType BathroomType
     */
    void delete(BathroomType bathroomType) throws ServiceException;

    /**
     * Method gets bathroomType by it's id
     *
     * @param id bathroomType ID
     * @return bathroomType BathroomType
     */
    BathroomType get(Serializable id) throws ServiceException;
}
