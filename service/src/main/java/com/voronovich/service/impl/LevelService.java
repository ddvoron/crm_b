package com.voronovich.service.impl;

import com.voronovich.dao.ILevelDao;
import com.voronovich.exception.DaoException;
import com.voronovich.model.Level;
import com.voronovich.service.ILevelService;
import com.voronovich.service.exception.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service("levelService")
@Transactional
public class LevelService implements ILevelService {

    private static Logger log = Logger.getLogger(LevelService.class);

    @Autowired
    private ILevelDao dao;

    @Override
    public void save(Level level) throws ServiceException {
        try {
            dao.save(level);
        } catch (DaoException e) {
            log.error("Error level save in LevelService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void update(Level level) throws ServiceException {
        try {
            dao.update(level);
        } catch (DaoException e) {
            log.error("Error level update in LevelService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(Level level) throws ServiceException {
        try {
            dao.delete(level);
        } catch (DaoException e) {
            log.error("Error level delete in LevelService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public Level get(Serializable id) throws ServiceException {
        try {
            return dao.get(id);
        } catch (DaoException e) {
            log.error("Error getting level by id in LevelService: " + e);
            throw new ServiceException(e);
        }
    }
}