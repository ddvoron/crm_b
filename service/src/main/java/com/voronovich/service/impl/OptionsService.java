package com.voronovich.service.impl;

import com.voronovich.dao.IOptionsDao;
import com.voronovich.exception.DaoException;
import com.voronovich.model.Options;
import com.voronovich.service.IOptionsService;
import com.voronovich.service.exception.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service("optionsService")
@Transactional
public class OptionsService implements IOptionsService {

    private static Logger log = Logger.getLogger(OptionsService.class);

    @Autowired
    private IOptionsDao dao;

    @Override
    public int save(Options options) throws ServiceException {
        try {
            return dao.save(options);
        } catch (DaoException e) {
            log.error("Error options save in OptionsService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void update(Options options) throws ServiceException {
        try {
            dao.update(options);
        } catch (DaoException e) {
            log.error("Error options update in OptionsService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(Options options) throws ServiceException {
        try {
            dao.delete(options);
        } catch (DaoException e) {
            log.error("Error options delete in OptionsService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public Options get(Serializable id) throws ServiceException {
        try {
            return dao.get(id);
        } catch (DaoException e) {
            log.error("Error getting options by id in OptionsService: " + e);
            throw new ServiceException(e);
        }
    }
}