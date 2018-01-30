package com.voronovich.service;

import com.voronovich.model.Flooring;
import com.voronovich.service.exception.ServiceException;

import java.io.Serializable;

public interface IFlooringService {

    /**
     * Method saves flooring
     *
     * @param flooring Flooring
     */
    void save(Flooring flooring) throws ServiceException;

    /**
     * Method updates flooring
     *
     * @param flooring Flooring
     */
    void update(Flooring flooring) throws ServiceException;

    /**
     * Method removes flooring from database
     *
     * @param flooring Flooring
     */
    void delete(Flooring flooring) throws ServiceException;

    /**
     * Method gets flooring by it's id
     *
     * @param id flooring ID
     * @return flooring Flooring
     */
    Flooring get(Serializable id) throws ServiceException;
}
