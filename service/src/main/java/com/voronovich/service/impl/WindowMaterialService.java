package com.voronovich.service.impl;

import com.voronovich.dao.IWindowMaterialDao;
import com.voronovich.exception.DaoException;
import com.voronovich.model.WindowMaterial;
import com.voronovich.service.IWindowMaterialService;
import com.voronovich.service.exception.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service("windowMaterialService")
@Transactional
public class WindowMaterialService implements IWindowMaterialService {

    private static Logger log = Logger.getLogger(WindowMaterialService.class);

    @Autowired
    private IWindowMaterialDao dao;

    @Override
    public void save(WindowMaterial windowMaterial) throws ServiceException {
        try {
            dao.save(windowMaterial);
        } catch (DaoException e) {
            log.error("Error windowMaterial save in WindowMaterialService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void update(WindowMaterial windowMaterial) throws ServiceException {
        try {
            dao.update(windowMaterial);
        } catch (DaoException e) {
            log.error("Error windowMaterial update in WindowMaterialService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(WindowMaterial windowMaterial) throws ServiceException {
        try {
            dao.delete(windowMaterial);
        } catch (DaoException e) {
            log.error("Error windowMaterial delete in WindowMaterialService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public WindowMaterial get(Serializable id) throws ServiceException {
        try {
            return dao.get(id);
        } catch (DaoException e) {
            log.error("Error getting windowMaterial by id in WindowMaterialService: " + e);
            throw new ServiceException(e);
        }
    }
}