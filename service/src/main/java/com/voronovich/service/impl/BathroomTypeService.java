package com.voronovich.service.impl;

import com.voronovich.dao.IBathroomTypeDao;
import com.voronovich.exception.DaoException;
import com.voronovich.model.BathroomType;
import com.voronovich.service.IBathroomTypeService;
import com.voronovich.service.exception.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service("bathroomTypeService")
@Transactional
public class BathroomTypeService implements IBathroomTypeService {

    private static Logger log = Logger.getLogger(BathroomTypeService.class);

    @Autowired
    private IBathroomTypeDao dao;

    @Override
    public void save(BathroomType bathroomType) throws ServiceException {
        try {
            dao.save(bathroomType);
        } catch (DaoException e) {
            log.error("Error bathroomType save in BathroomTypeService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void update(BathroomType bathroomType) throws ServiceException {
        try {
            dao.update(bathroomType);
        } catch (DaoException e) {
            log.error("Error bathroomType update in BathroomTypeService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(BathroomType bathroomType) throws ServiceException {
        try {
            dao.delete(bathroomType);
        } catch (DaoException e) {
            log.error("Error bathroomType delete in BathroomTypeService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public BathroomType get(Serializable id) throws ServiceException {
        try {
            return dao.get(id);
        } catch (DaoException e) {
            log.error("Error getting bathroomType by id in BathroomTypeService: " + e);
            throw new ServiceException(e);
        }
    }
}