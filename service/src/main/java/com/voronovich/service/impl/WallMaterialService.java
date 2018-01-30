package com.voronovich.service.impl;

import com.voronovich.dao.IWallMaterialDao;
import com.voronovich.exception.DaoException;
import com.voronovich.model.WallMaterial;
import com.voronovich.service.IWallMaterialService;
import com.voronovich.service.exception.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service("wallMaterialService")
@Transactional
public class WallMaterialService implements IWallMaterialService {

    private static Logger log = Logger.getLogger(WallMaterialService.class);

    @Autowired
    private IWallMaterialDao dao;

    @Override
    public void save(WallMaterial wallMaterial) throws ServiceException {
        try {
            dao.save(wallMaterial);
        } catch (DaoException e) {
            log.error("Error wallMaterial save in WallMaterialService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void update(WallMaterial wallMaterial) throws ServiceException {
        try {
            dao.update(wallMaterial);
        } catch (DaoException e) {
            log.error("Error wallMaterial update in WallMaterialService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(WallMaterial wallMaterial) throws ServiceException {
        try {
            dao.delete(wallMaterial);
        } catch (DaoException e) {
            log.error("Error wallMaterial delete in WallMaterialService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public WallMaterial get(Serializable id) throws ServiceException {
        try {
            return dao.get(id);
        } catch (DaoException e) {
            log.error("Error getting wallMaterial by id in WallMaterialService: " + e);
            throw new ServiceException(e);
        }
    }
}