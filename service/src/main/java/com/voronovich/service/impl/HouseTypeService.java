package com.voronovich.service.impl;

import com.voronovich.dao.IHouseTypeDao;
import com.voronovich.exception.DaoException;
import com.voronovich.model.HouseType;
import com.voronovich.service.IHouseTypeService;
import com.voronovich.service.exception.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service("houseTypeService")
@Transactional
public class HouseTypeService implements IHouseTypeService {

    private static Logger log = Logger.getLogger(HouseTypeService.class);

    @Autowired
    private IHouseTypeDao dao;

    @Override
    public void save(HouseType houseType) throws ServiceException {
        try {
            dao.save(houseType);
        } catch (DaoException e) {
            log.error("Error houseType save in HouseTypeService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void update(HouseType houseType) throws ServiceException {
        try {
            dao.update(houseType);
        } catch (DaoException e) {
            log.error("Error houseType update in HouseTypeService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(HouseType houseType) throws ServiceException {
        try {
            dao.delete(houseType);
        } catch (DaoException e) {
            log.error("Error houseType delete in HouseTypeService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public HouseType get(Serializable id) throws ServiceException {
        try {
            return dao.get(id);
        } catch (DaoException e) {
            log.error("Error getting houseType by id in HouseTypeService: " + e);
            throw new ServiceException(e);
        }
    }
}