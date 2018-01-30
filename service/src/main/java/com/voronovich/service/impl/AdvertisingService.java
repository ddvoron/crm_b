package com.voronovich.service.impl;

import com.voronovich.dao.IAdvertisingDao;
import com.voronovich.exception.DaoException;
import com.voronovich.model.Advertising;
import com.voronovich.service.IAdvertisingService;
import com.voronovich.service.exception.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service("advertisingService")
@Transactional
public class AdvertisingService implements IAdvertisingService {

    private static Logger log = Logger.getLogger(AdvertisingService.class);

    @Autowired
    private IAdvertisingDao dao;

    @Override
    public int save(Advertising advertising) throws ServiceException {
        try {
            return dao.save(advertising);
        } catch (DaoException e) {
            log.error("Error advertising save in AdvertisingService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void update(Advertising advertising) throws ServiceException {
        try {
            dao.update(advertising);
        } catch (DaoException e) {
            log.error("Error advertising update in AdvertisingService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(Advertising advertising) throws ServiceException {
        try {
            dao.delete(advertising);
        } catch (DaoException e) {
            log.error("Error advertising delete in AdvertisingService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public Advertising get(Serializable id) throws ServiceException {
        try {
            return dao.get(id);
        } catch (DaoException e) {
            log.error("Error getting advertising by id in AdvertisingService: " + e);
            throw new ServiceException(e);
        }
    }
}