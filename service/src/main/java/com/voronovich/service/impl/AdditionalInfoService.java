package com.voronovich.service.impl;

import com.voronovich.dao.IAdditionalInfoDao;
import com.voronovich.exception.DaoException;
import com.voronovich.model.AdditionalInfo;
import com.voronovich.service.IAdditionalInfoService;
import com.voronovich.service.exception.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service("additionalInfoService")
@Transactional
public class AdditionalInfoService implements IAdditionalInfoService {

    private static Logger log = Logger.getLogger(AdditionalInfoService.class);

    @Autowired
    private IAdditionalInfoDao dao;

    @Override
    public int save(AdditionalInfo additionalInfo) throws ServiceException {
        try {
            return dao.save(additionalInfo);
        } catch (DaoException e) {
            log.error("Error additionalInfo save in AdditionalInfoService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void update(AdditionalInfo additionalInfo) throws ServiceException {
        try {
            dao.update(additionalInfo);
        } catch (DaoException e) {
            log.error("Error additionalInfo update in AdditionalInfoService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(AdditionalInfo additionalInfo) throws ServiceException {
        try {
            dao.delete(additionalInfo);
        } catch (DaoException e) {
            log.error("Error additionalInfo delete in AdditionalInfoService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public AdditionalInfo get(Serializable id) throws ServiceException {
        try {
            return dao.get(id);
        } catch (DaoException e) {
            log.error("Error getting additionalInfo by id in AdditionalInfoService: " + e);
            throw new ServiceException(e);
        }
    }
}