package com.voronovich.service.impl;

import com.voronovich.dao.IUserAccessDao;
import com.voronovich.exception.DaoException;
import com.voronovich.model.UserAccess;
import com.voronovich.service.IUserAccessService;
import com.voronovich.service.exception.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service("userAccessService")
@Transactional
public class UserAccessService implements IUserAccessService {

    private static Logger log = Logger.getLogger(UserAccessService.class);

    @Autowired
    private IUserAccessDao dao;

    @Override
    public void save(UserAccess userAccess) throws ServiceException {
        try {
            dao.save(userAccess);
        } catch (DaoException e) {
            log.error("Error userAccess save in UserAccessService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void update(UserAccess userAccess) throws ServiceException {
        try {
            dao.update(userAccess);
        } catch (DaoException e) {
            log.error("Error userAccess update in UserAccessService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(UserAccess userAccess) throws ServiceException {
        try {
            dao.delete(userAccess);
        } catch (DaoException e) {
            log.error("Error userAccess delete in UserAccessService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public UserAccess get(Serializable id) throws ServiceException {
        UserAccess userAccess = null;
        try {
            userAccess = dao.get(id);
            return userAccess;
        } catch (DaoException e) {
            log.error("Error getting userAccess by id in UserAccessService: " + e);
            throw new ServiceException(e);
        }
    }
}