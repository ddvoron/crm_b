package com.voronovich.service;

import com.voronovich.model.HouseType;
import com.voronovich.service.exception.ServiceException;

import java.io.Serializable;

public interface IHouseTypeService {

    /**
     * Method saves houseType
     *
     * @param houseType HouseType
     */
    void save(HouseType houseType) throws ServiceException;

    /**
     * Method updates houseType
     *
     * @param houseType HouseType
     */
    void update(HouseType houseType) throws ServiceException;

    /**
     * Method removes houseType from database
     *
     * @param houseType HouseType
     */
    void delete(HouseType houseType) throws ServiceException;

    /**
     * Method gets houseType by it's id
     *
     * @param id houseType ID
     * @return houseType HouseType
     */
    HouseType get(Serializable id) throws ServiceException;
}
