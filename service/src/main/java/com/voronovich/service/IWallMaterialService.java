package com.voronovich.service;

import com.voronovich.model.WallMaterial;
import com.voronovich.service.exception.ServiceException;

import java.io.Serializable;

public interface IWallMaterialService {

    /**
     * Method saves wallMaterial
     *
     * @param wallMaterial WallMaterial
     */
    void save(WallMaterial wallMaterial) throws ServiceException;

    /**
     * Method updates wallMaterial
     *
     * @param wallMaterial WallMaterial
     */
    void update(WallMaterial wallMaterial) throws ServiceException;

    /**
     * Method removes wallMaterial from database
     *
     * @param wallMaterial WallMaterial
     */
    void delete(WallMaterial wallMaterial) throws ServiceException;

    /**
     * Method gets wallMaterial by it's id
     *
     * @param id wallMaterial ID
     * @return wallMaterial WallMaterial
     */
    WallMaterial get(Serializable id) throws ServiceException;
}
