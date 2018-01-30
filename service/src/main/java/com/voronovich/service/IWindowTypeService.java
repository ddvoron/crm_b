package com.voronovich.service;

import com.voronovich.model.WindowType;
import com.voronovich.service.exception.ServiceException;

import java.io.Serializable;

public interface IWindowTypeService {

    /**
     * Method saves windowType
     *
     * @param windowType WindowType
     */
    void save(WindowType windowType) throws ServiceException;

    /**
     * Method updates windowType
     *
     * @param windowType WindowType
     */
    void update(WindowType windowType) throws ServiceException;

    /**
     * Method removes windowType from database
     *
     * @param windowType WindowType
     */
    void delete(WindowType windowType) throws ServiceException;

    /**
     * Method gets windowType by it's id
     *
     * @param id windowType ID
     * @return windowType WindowType
     */
    WindowType get(Serializable id) throws ServiceException;
}
