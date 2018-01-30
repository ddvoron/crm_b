package com.voronovich.service.impl;

import com.voronovich.dao.ILocationDao;
import com.voronovich.exception.DaoException;
import com.voronovich.model.Location;
import com.voronovich.service.ILocationService;
import com.voronovich.service.exception.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service("locationService")
@Transactional
public class LocationService implements ILocationService {

    private static Logger log = Logger.getLogger(LocationService.class);

    @Autowired
    private ILocationDao dao;

    @Override
    public int save(Location location) throws ServiceException {
        try {
            return dao.save(location);
        } catch (DaoException e) {
            log.error("Error location save in LocationService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void update(Location location) throws ServiceException {
        try {
            dao.update(location);
        } catch (DaoException e) {
            log.error("Error location update in LocationService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(Location location) throws ServiceException {
        try {
            dao.delete(location);
        } catch (DaoException e) {
            log.error("Error location delete in LocationService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public Location get(Serializable id) throws ServiceException {
        Location location = null;
        try {
            location = dao.get(id);
            return location;
        } catch (DaoException e) {
            log.error("Error getting location by id in LocationService: " + e);
            throw new ServiceException(e);
        }
    }
}