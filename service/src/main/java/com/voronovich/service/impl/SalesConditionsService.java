package com.voronovich.service.impl;

import com.voronovich.dao.ISalesConditionsDao;
import com.voronovich.exception.DaoException;
import com.voronovich.model.SalesConditions;
import com.voronovich.service.ISalesConditionsService;
import com.voronovich.service.exception.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service("salesConditionsService")
@Transactional
public class SalesConditionsService implements ISalesConditionsService {

    private static Logger log = Logger.getLogger(SalesConditionsService.class);

    @Autowired
    private ISalesConditionsDao dao;

    @Override
    public void save(SalesConditions salesConditions) throws ServiceException {
        try {
            dao.save(salesConditions);
        } catch (DaoException e) {
            log.error("Error salesConditions save in SalesConditionsService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void update(SalesConditions salesConditions) throws ServiceException {
        try {
            dao.update(salesConditions);
        } catch (DaoException e) {
            log.error("Error salesConditions update in SalesConditionsService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(SalesConditions salesConditions) throws ServiceException {
        try {
            dao.delete(salesConditions);
        } catch (DaoException e) {
            log.error("Error salesConditions delete in SalesConditionsService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public SalesConditions get(Serializable id) throws ServiceException {
        try {
            return dao.get(id);
        } catch (DaoException e) {
            log.error("Error getting salesConditions by id in SalesConditionsService: " + e);
            throw new ServiceException(e);
        }
    }
}