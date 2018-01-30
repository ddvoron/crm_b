package com.voronovich.service;

import com.voronovich.model.Location;
import com.voronovich.service.exception.ServiceException;

import java.io.Serializable;

public interface ILocationService {

    /**
     * Method saves location
     *
     * @param location Location
     */
    int save(Location location) throws ServiceException;

    /**
     * Method updates location
     *
     * @param location Location
     */
    void update(Location location) throws ServiceException;

    /**
     * Method removes location from database
     *
     * @param location Location
     */
    void delete(Location location) throws ServiceException;

    /**
     * Method gets location by it's id
     *
     * @param id location ID
     * @return location Location
     */
    Location get(Serializable id) throws ServiceException;
}
