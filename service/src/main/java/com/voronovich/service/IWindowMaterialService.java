package com.voronovich.service;

import com.voronovich.model.WindowMaterial;
import com.voronovich.service.exception.ServiceException;

import java.io.Serializable;

public interface IWindowMaterialService {

    /**
     * Method saves windowMaterial
     *
     * @param windowMaterial WindowMaterial
     */
    void save(WindowMaterial windowMaterial) throws ServiceException;

    /**
     * Method updates windowMaterial
     *
     * @param windowMaterial WindowMaterial
     */
    void update(WindowMaterial windowMaterial) throws ServiceException;

    /**
     * Method removes windowMaterial from database
     *
     * @param windowMaterial WindowMaterial
     */
    void delete(WindowMaterial windowMaterial) throws ServiceException;

    /**
     * Method gets windowMaterial by it's id
     *
     * @param id windowMaterial ID
     * @return windowMaterial WindowMaterial
     */
    WindowMaterial get(Serializable id) throws ServiceException;
}
