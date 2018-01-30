package com.voronovich.service;

import com.voronovich.model.InteriorFinishCondition;
import com.voronovich.service.exception.ServiceException;

import java.io.Serializable;

public interface IInteriorFinishConditionService {

    /**
     * Method saves interiorFinishCondition
     *
     * @param interiorFinishCondition InteriorFinishCondition
     */
    void save(InteriorFinishCondition interiorFinishCondition) throws ServiceException;

    /**
     * Method updates interiorFinishCondition
     *
     * @param interiorFinishCondition InteriorFinishCondition
     */
    void update(InteriorFinishCondition interiorFinishCondition) throws ServiceException;

    /**
     * Method removes interiorFinishCondition from database
     *
     * @param interiorFinishCondition InteriorFinishCondition
     */
    void delete(InteriorFinishCondition interiorFinishCondition) throws ServiceException;

    /**
     * Method gets interiorFinishCondition by it's id
     *
     * @param id interiorFinishCondition ID
     * @return interiorFinishCondition InteriorFinishCondition
     */
    InteriorFinishCondition get(Serializable id) throws ServiceException;
}
