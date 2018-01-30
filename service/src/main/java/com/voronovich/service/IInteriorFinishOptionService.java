package com.voronovich.service;

import com.voronovich.model.InteriorFinishOption;
import com.voronovich.service.exception.ServiceException;

import java.io.Serializable;

public interface IInteriorFinishOptionService {

    /**
     * Method saves interiorFinishOption
     *
     * @param interiorFinishOption InteriorFinishOption
     */
    void save(InteriorFinishOption interiorFinishOption) throws ServiceException;

    /**
     * Method updates interiorFinishOption
     *
     * @param interiorFinishOption InteriorFinishOption
     */
    void update(InteriorFinishOption interiorFinishOption) throws ServiceException;

    /**
     * Method removes interiorFinishOption from database
     *
     * @param interiorFinishOption InteriorFinishOption
     */
    void delete(InteriorFinishOption interiorFinishOption) throws ServiceException;

    /**
     * Method gets interiorFinishOption by it's id
     *
     * @param id interiorFinishOption ID
     * @return interiorFinishOption InteriorFinishOption
     */
    InteriorFinishOption get(Serializable id) throws ServiceException;
}
