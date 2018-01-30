package com.voronovich.service.impl;

import com.voronovich.dao.IFurnitureDao;
import com.voronovich.exception.DaoException;
import com.voronovich.model.Furniture;
import com.voronovich.service.IFurnitureService;
import com.voronovich.service.exception.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service("furnitureService")
@Transactional
public class FurnitureService implements IFurnitureService {

    private static Logger log = Logger.getLogger(FurnitureService.class);

    @Autowired
    private IFurnitureDao dao;

    @Override
    public void save(Furniture furniture) throws ServiceException {
        try {
            dao.save(furniture);
        } catch (DaoException e) {
            log.error("Error furniture save in FurnitureService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void update(Furniture furniture) throws ServiceException {
        try {
            dao.update(furniture);
        } catch (DaoException e) {
            log.error("Error furniture update in FurnitureService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(Furniture furniture) throws ServiceException {
        try {
            dao.delete(furniture);
        } catch (DaoException e) {
            log.error("Error furniture delete in FurnitureService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public Furniture get(Serializable id) throws ServiceException {
        try {
            return dao.get(id);
        } catch (DaoException e) {
            log.error("Error getting furniture by id in FurnitureService: " + e);
            throw new ServiceException(e);
        }
    }
}