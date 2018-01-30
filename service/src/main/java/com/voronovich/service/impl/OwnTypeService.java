package com.voronovich.service.impl;

import com.voronovich.dao.IOwnTypeDao;
import com.voronovich.exception.DaoException;
import com.voronovich.model.OwnType;
import com.voronovich.service.IOwnTypeService;
import com.voronovich.service.exception.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service("ownTypeService")
@Transactional
public class OwnTypeService implements IOwnTypeService {

    private static Logger log = Logger.getLogger(OwnTypeService.class);

    @Autowired
    private IOwnTypeDao dao;

    @Override
    public void save(OwnType ownType) throws ServiceException {
        try {
            dao.save(ownType);
        } catch (DaoException e) {
            log.error("Error ownType save in OwnTypeService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void update(OwnType ownType) throws ServiceException {
        try {
            dao.update(ownType);
        } catch (DaoException e) {
            log.error("Error ownType update in OwnTypeService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(OwnType ownType) throws ServiceException {
        try {
            dao.delete(ownType);
        } catch (DaoException e) {
            log.error("Error ownType delete in OwnTypeService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public OwnType get(Serializable id) throws ServiceException {
        try {
            return dao.get(id);
        } catch (DaoException e) {
            log.error("Error getting ownType by id in OwnTypeService: " + e);
            throw new ServiceException(e);
        }
    }
}