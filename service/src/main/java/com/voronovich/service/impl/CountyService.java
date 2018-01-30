package com.voronovich.service.impl;

import com.voronovich.dao.ICountyDao;
import com.voronovich.exception.DaoException;
import com.voronovich.model.County;
import com.voronovich.service.ICountyService;
import com.voronovich.service.exception.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service("countyService")
@Transactional
public class CountyService implements ICountyService {

    private static Logger log = Logger.getLogger(CountyService.class);

    @Autowired
    private ICountyDao dao;

    @Override
    public void save(County county) throws ServiceException {
        try {
            dao.save(county);
        } catch (DaoException e) {
            log.error("Error county save in CountyService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void update(County county) throws ServiceException {
        try {
            dao.update(county);
        } catch (DaoException e) {
            log.error("Error county update in CountyService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(County county) throws ServiceException {
        try {
            dao.delete(county);
        } catch (DaoException e) {
            log.error("Error county delete in CountyService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public County get(Serializable id) throws ServiceException {
        try {
            return dao.get(id);
        } catch (DaoException e) {
            log.error("Error getting county by id in CountyService: " + e);
            throw new ServiceException(e);
        }
    }
}