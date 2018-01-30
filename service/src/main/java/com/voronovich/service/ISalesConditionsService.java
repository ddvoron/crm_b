package com.voronovich.service;

import com.voronovich.model.SalesConditions;
import com.voronovich.service.exception.ServiceException;

import java.io.Serializable;

public interface ISalesConditionsService {

    /**
     * Method saves salesConditions
     *
     * @param salesConditions SalesConditions
     */
    void save(SalesConditions salesConditions) throws ServiceException;

    /**
     * Method updates salesConditions
     *
     * @param salesConditions SalesConditions
     */
    void update(SalesConditions salesConditions) throws ServiceException;

    /**
     * Method removes salesConditions from database
     *
     * @param salesConditions SalesConditions
     */
    void delete(SalesConditions salesConditions) throws ServiceException;

    /**
     * Method gets salesConditions by it's id
     *
     * @param id salesConditions ID
     * @return salesConditions SalesConditions
     */
    SalesConditions get(Serializable id) throws ServiceException;
}
