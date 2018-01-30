package com.voronovich.service;

import com.voronovich.model.AdditionalInfo;
import com.voronovich.service.exception.ServiceException;

import java.io.Serializable;

public interface IAdditionalInfoService {

    /**
     * Method saves AdditionalInfo
     *
     * @param additionalInfo AdditionalInfo
     */
    int save(AdditionalInfo additionalInfo) throws ServiceException;

    /**
     * Method updates additionalInfo
     *
     * @param additionalInfo AdditionalInfo
     */
    void update(AdditionalInfo additionalInfo) throws ServiceException;

    /**
     * Method removes additionalInfo from database
     *
     * @param additionalInfo AdditionalInfo
     */
    void delete(AdditionalInfo additionalInfo) throws ServiceException;

    /**
     * Method gets additionalInfo by it's id
     *
     * @param id additionalInfo ID
     * @return additionalInfo AdditionalInfo
     */
    AdditionalInfo get(Serializable id) throws ServiceException;
}
