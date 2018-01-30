package com.voronovich.service.impl;

import com.voronovich.dao.IFlooringDao;
import com.voronovich.exception.DaoException;
import com.voronovich.model.Flooring;
import com.voronovich.service.IFlooringService;
import com.voronovich.service.exception.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service("flooringService")
@Transactional
public class FlooringService implements IFlooringService {

    private static Logger log = Logger.getLogger(FlooringService.class);

    @Autowired
    private IFlooringDao dao;

    @Override
    public void save(Flooring flooring) throws ServiceException {
        try {
            dao.save(flooring);
        } catch (DaoException e) {
            log.error("Error flooring save in FlooringService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void update(Flooring flooring) throws ServiceException {
        try {
            dao.update(flooring);
        } catch (DaoException e) {
            log.error("Error flooring update in FlooringService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(Flooring flooring) throws ServiceException {
        try {
            dao.delete(flooring);
        } catch (DaoException e) {
            log.error("Error flooring delete in FlooringService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public Flooring get(Serializable id) throws ServiceException {
        try {
            return dao.get(id);
        } catch (DaoException e) {
            log.error("Error getting flooring by id in FlooringService: " + e);
            throw new ServiceException(e);
        }
    }
}