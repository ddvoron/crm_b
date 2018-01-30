package com.voronovich.service.impl;

import com.voronovich.dao.ITerraceDao;
import com.voronovich.exception.DaoException;
import com.voronovich.model.Terrace;
import com.voronovich.service.ITerraceService;
import com.voronovich.service.exception.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service("terraceService")
@Transactional
public class TerraceService implements ITerraceService {

    private static Logger log = Logger.getLogger(TerraceService.class);

    @Autowired
    private ITerraceDao dao;

    @Override
    public void save(Terrace terrace) throws ServiceException {
        try {
            dao.save(terrace);
        } catch (DaoException e) {
            log.error("Error terrace save in TerraceService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void update(Terrace terrace) throws ServiceException {
        try {
            dao.update(terrace);
        } catch (DaoException e) {
            log.error("Error terrace update in TerraceService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(Terrace terrace) throws ServiceException {
        try {
            dao.delete(terrace);
        } catch (DaoException e) {
            log.error("Error terrace delete in TerraceService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public Terrace get(Serializable id) throws ServiceException {
        try {
            return dao.get(id);
        } catch (DaoException e) {
            log.error("Error getting terrace by id in TerraceService: " + e);
            throw new ServiceException(e);
        }
    }
}