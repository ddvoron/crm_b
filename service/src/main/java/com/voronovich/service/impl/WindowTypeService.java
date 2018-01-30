package com.voronovich.service.impl;

import com.voronovich.dao.IWindowTypeDao;
import com.voronovich.exception.DaoException;
import com.voronovich.model.WindowType;
import com.voronovich.service.IWindowTypeService;
import com.voronovich.service.exception.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service("windowTypeService")
@Transactional
public class WindowTypeService implements IWindowTypeService {

    private static Logger log = Logger.getLogger(WindowTypeService.class);

    @Autowired
    private IWindowTypeDao dao;

    @Override
    public void save(WindowType windowType) throws ServiceException {
        try {
            dao.save(windowType);
        } catch (DaoException e) {
            log.error("Error windowType save in WindowTypeService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void update(WindowType windowType) throws ServiceException {
        try {
            dao.update(windowType);
        } catch (DaoException e) {
            log.error("Error windowType update in WindowTypeService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(WindowType windowType) throws ServiceException {
        try {
            dao.delete(windowType);
        } catch (DaoException e) {
            log.error("Error windowType delete in WindowTypeService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public WindowType get(Serializable id) throws ServiceException {
        try {
            return dao.get(id);
        } catch (DaoException e) {
            log.error("Error getting windowType by id in WindowTypeService: " + e);
            throw new ServiceException(e);
        }
    }
}