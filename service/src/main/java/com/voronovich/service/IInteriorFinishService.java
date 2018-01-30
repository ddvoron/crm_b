package com.voronovich.service;

import com.voronovich.model.InteriorFinish;
import com.voronovich.service.exception.ServiceException;

import java.io.Serializable;

public interface IInteriorFinishService {

    /**
     * Method saves interiorFinish
     *
     * @param interiorFinish InteriorFinish
     */
    void save(InteriorFinish interiorFinish) throws ServiceException;

    /**
     * Method updates interiorFinishOption
     *
     * @param interiorFinish InteriorFinish
     */
    void update(InteriorFinish interiorFinish) throws ServiceException;

    /**
     * Method removes interiorFinish from database
     *
     * @param interiorFinish InteriorFinish
     */
    void delete(InteriorFinish interiorFinish) throws ServiceException;

    /**
     * Method gets interiorFinish by it's id
     *
     * @param id interiorFinish ID
     * @return interiorFinish InteriorFinish
     */
    InteriorFinish get(Serializable id) throws ServiceException;
}
