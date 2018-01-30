package com.voronovich.service.impl;

import com.voronovich.dao.IBalconyTypeDao;
import com.voronovich.exception.DaoException;
import com.voronovich.model.BalconyType;
import com.voronovich.service.IBalconyTypeService;
import com.voronovich.service.exception.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service("balconyTypeService")
@Transactional
public class BalconyTypeService implements IBalconyTypeService {

    private static Logger log = Logger.getLogger(BalconyTypeService.class);

    @Autowired
    private IBalconyTypeDao dao;

    @Override
    public void save(BalconyType balconyType) throws ServiceException {
        try {
            dao.save(balconyType);
        } catch (DaoException e) {
            log.error("Error balconyType save in BalconyTypeService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void update(BalconyType balconyType) throws ServiceException {
        try {
            dao.update(balconyType);
        } catch (DaoException e) {
            log.error("Error balconyType update in BalconyTypeService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(BalconyType balconyType) throws ServiceException {
        try {
            dao.delete(balconyType);
        } catch (DaoException e) {
            log.error("Error balconyType delete in BalconyTypeService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public BalconyType get(Serializable id) throws ServiceException {
        try {
            return dao.get(id);
        } catch (DaoException e) {
            log.error("Error getting balconyType by id in BalconyTypeService: " + e);
            throw new ServiceException(e);
        }
    }
}