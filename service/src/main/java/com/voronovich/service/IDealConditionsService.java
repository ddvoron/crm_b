package com.voronovich.service;

import com.voronovich.model.DealConditions;
import com.voronovich.service.exception.ServiceException;

import java.io.Serializable;

public interface IDealConditionsService {

    /**
     * Method saves DealConditions
     *
     * @param dealConditions DealConditions
     */
    int save(DealConditions dealConditions) throws ServiceException;

    /**
     * Method updates dealConditions
     *
     * @param dealConditions DealConditions
     */
    void update(DealConditions dealConditions) throws ServiceException;

    /**
     * Method removes dealConditions from database
     *
     * @param dealConditions DealConditions
     */
    void delete(DealConditions dealConditions) throws ServiceException;

    /**
     * Method gets dealConditions by it's id
     *
     * @param id dealConditions ID
     * @return dealConditions DealConditions
     */
    DealConditions get(Serializable id) throws ServiceException;
}
