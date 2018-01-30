package com.voronovich.service.impl;

import com.voronovich.dao.IMetroDao;
import com.voronovich.exception.DaoException;
import com.voronovich.model.Metro;
import com.voronovich.service.IMetroService;
import com.voronovich.service.exception.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service("metroService")
@Transactional
public class MetroService implements IMetroService {

    private static Logger log = Logger.getLogger(MetroService.class);

    @Autowired
    private IMetroDao dao;

    @Override
    public void save(Metro metro) throws ServiceException {
        try {
            dao.save(metro);
        } catch (DaoException e) {
            log.error("Error metro save in MetroService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void update(Metro metro) throws ServiceException {
        try {
            dao.update(metro);
        } catch (DaoException e) {
            log.error("Error metro update in MetroService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(Metro metro) throws ServiceException {
        try {
            dao.delete(metro);
        } catch (DaoException e) {
            log.error("Error metro delete in MetroService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public Metro get(Serializable id) throws ServiceException {
        try {
            return dao.get(id);
        } catch (DaoException e) {
            log.error("Error getting metro by id in MetroService: " + e);
            throw new ServiceException(e);
        }
    }
}