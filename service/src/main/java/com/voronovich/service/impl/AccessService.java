package com.voronovich.service.impl;

import com.voronovich.dao.IAccessDao;
import com.voronovich.exception.DaoException;
import com.voronovich.model.Access;
import com.voronovich.service.IAccessService;
import com.voronovich.service.exception.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service("accessService")
@Transactional
public class AccessService implements IAccessService {

    private static Logger log = Logger.getLogger(AccessService.class);

    @Autowired
    private IAccessDao dao;

    @Override
    public void save(Access access) throws ServiceException {
        try {
            dao.save(access);
        } catch (DaoException e) {
            log.error("Error access save in AccessService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void update(Access access) throws ServiceException {
        try {
            dao.update(access);
        } catch (DaoException e) {
            log.error("Error access update in AccessService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(Access access) throws ServiceException {
        try {
            dao.delete(access);
        } catch (DaoException e) {
            log.error("Error access delete in AccessService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public Access get(Serializable id) throws ServiceException {
        Access access = null;
        try {
            access = dao.get(id);
            return access;
        } catch (DaoException e) {
            log.error("Error getting access by id in AccessService: " + e);
            throw new ServiceException(e);
        }
    }
}