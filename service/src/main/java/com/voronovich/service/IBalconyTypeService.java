package com.voronovich.service;

import com.voronovich.model.BalconyType;
import com.voronovich.service.exception.ServiceException;

import java.io.Serializable;
import java.util.List;

public interface IBalconyTypeService {

    /**
     * Method saves balconyType
     *
     * @param balconyType BalconyType
     */
    void save(BalconyType balconyType) throws ServiceException;

    /**
     * Method updates balconyType
     *
     * @param balconyType BalconyType
     */
    void update(BalconyType balconyType) throws ServiceException;

    /**
     * Method removes balconyType from database
     *
     * @param balconyType BalconyType
     */
    void delete(BalconyType balconyType) throws ServiceException;

    /**
     * Method gets balconyType by it's id
     *
     * @param id balconyType ID
     * @return balconyType BalconyType
     */
    BalconyType get(Serializable id) throws ServiceException;
}
