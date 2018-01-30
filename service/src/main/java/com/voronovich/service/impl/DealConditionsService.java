package com.voronovich.service.impl;

import com.voronovich.dao.IDealConditionsDao;
import com.voronovich.exception.DaoException;
import com.voronovich.model.DealConditions;
import com.voronovich.service.IDealConditionsService;
import com.voronovich.service.exception.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service("dealConditionsService")
@Transactional
public class DealConditionsService implements IDealConditionsService {

    private static Logger log = Logger.getLogger(DealConditionsService.class);

    @Autowired
    private IDealConditionsDao dao;

    @Override
    public int save(DealConditions dealConditions) throws ServiceException {
        try {
            return dao.save(dealConditions);
        } catch (DaoException e) {
            log.error("Error dealConditions save in DealConditionsService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void update(DealConditions dealConditions) throws ServiceException {
        try {
            dao.update(dealConditions);
        } catch (DaoException e) {
            log.error("Error dealConditions update in DealConditionsService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(DealConditions dealConditions) throws ServiceException {
        try {
            dao.delete(dealConditions);
        } catch (DaoException e) {
            log.error("Error dealConditions delete in DealConditionsService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public DealConditions get(Serializable id) throws ServiceException {
        try {
            return dao.get(id);
        } catch (DaoException e) {
            log.error("Error getting dealConditions by id in DealConditionsService: " + e);
            throw new ServiceException(e);
        }
    }
}