package com.voronovich.service;

import com.voronovich.model.NoncomSales;
import com.voronovich.service.exception.ServiceException;

import java.io.Serializable;

public interface INoncomSalesService {

    /**
     * Method saves noncomSales
     *
     * @param noncomSales NoncomSales
     */
    void save(NoncomSales noncomSales) throws ServiceException;

    /**
     * Method updates noncomSales
     *
     * @param noncomSales NoncomSales
     */
    void update(NoncomSales noncomSales) throws ServiceException;

    /**
     * Method removes noncomSales from database
     *
     * @param noncomSales NoncomSales
     */
    void delete(NoncomSales noncomSales) throws ServiceException;

    /**
     * Method gets noncomSales by it's id
     *
     * @param id noncomSales ID
     * @return noncomSales NoncomSales
     */
    NoncomSales get(Serializable id) throws ServiceException;
}
