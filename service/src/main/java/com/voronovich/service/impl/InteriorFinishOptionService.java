package com.voronovich.service.impl;

import com.voronovich.dao.IInteriorFinishOptionDao;
import com.voronovich.exception.DaoException;
import com.voronovich.model.InteriorFinishOption;
import com.voronovich.service.IInteriorFinishOptionService;
import com.voronovich.service.exception.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service("interiorFinishOptionService")
@Transactional
public class InteriorFinishOptionService implements IInteriorFinishOptionService {

    private static Logger log = Logger.getLogger(InteriorFinishOptionService.class);

    @Autowired
    private IInteriorFinishOptionDao dao;

    @Override
    public void save(InteriorFinishOption interiorFinishOption) throws ServiceException {
        try {
            dao.save(interiorFinishOption);
        } catch (DaoException e) {
            log.error("Error interiorFinishOption save in InteriorFinishOptionService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void update(InteriorFinishOption interiorFinishOption) throws ServiceException {
        try {
            dao.update(interiorFinishOption);
        } catch (DaoException e) {
            log.error("Error interiorFinishOption update in InteriorFinishOptionService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(InteriorFinishOption interiorFinishOption) throws ServiceException {
        try {
            dao.delete(interiorFinishOption);
        } catch (DaoException e) {
            log.error("Error interiorFinishOption delete in InteriorFinishOptionService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public InteriorFinishOption get(Serializable id) throws ServiceException {
        try {
            return dao.get(id);
        } catch (DaoException e) {
            log.error("Error getting interiorFinishOption by id in InteriorFinishOptionService: " + e);
            throw new ServiceException(e);
        }
    }
}