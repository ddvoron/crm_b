package com.voronovich.service;

import com.voronovich.model.Level;
import com.voronovich.service.exception.ServiceException;

import java.io.Serializable;

public interface ILevelService {

    /**
     * Method saves level
     *
     * @param level Level
     */
    void save(Level level) throws ServiceException;

    /**
     * Method updates level
     *
     * @param level Level
     */
    void update(Level level) throws ServiceException;

    /**
     * Method removes level from database
     *
     * @param level Level
     */
    void delete(Level level) throws ServiceException;

    /**
     * Method gets level by it's id
     *
     * @param id level ID
     * @return level Level
     */
    Level get(Serializable id) throws ServiceException;
}
