package com.voronovich.service.impl;

import com.voronovich.dao.IInteriorFinishDao;
import com.voronovich.exception.DaoException;
import com.voronovich.model.InteriorFinish;
import com.voronovich.service.IInteriorFinishService;
import com.voronovich.service.exception.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service("interiorFinishService")
@Transactional
public class InteriorFinishService implements IInteriorFinishService {

    private static Logger log = Logger.getLogger(InteriorFinishService.class);

    @Autowired
    private IInteriorFinishDao dao;

    @Override
    public void save(InteriorFinish interiorFinish) throws ServiceException {
        try {
            dao.save(interiorFinish);
        } catch (DaoException e) {
            log.error("Error interiorFinish save in InteriorFinishService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void update(InteriorFinish interiorFinish) throws ServiceException {
        try {
            dao.update(interiorFinish);
        } catch (DaoException e) {
            log.error("Error interiorFinish update in InteriorFinishService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(InteriorFinish interiorFinish) throws ServiceException {
        try {
            dao.delete(interiorFinish);
        } catch (DaoException e) {
            log.error("Error interiorFinish delete in InteriorFinishService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public InteriorFinish get(Serializable id) throws ServiceException {
        try {
            return dao.get(id);
        } catch (DaoException e) {
            log.error("Error getting interiorFinish by id in InteriorFinishService: " + e);
            throw new ServiceException(e);
        }
    }
}