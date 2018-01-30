package com.voronovich.service.impl;

import com.voronovich.dao.IUserDao;
import com.voronovich.exception.DaoException;
import com.voronovich.model.User;
import com.voronovich.service.IUserService;
import com.voronovich.service.exception.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Service("userService")
@Transactional
public class UserService implements IUserService {

    private static Logger log = Logger.getLogger(UserService.class);

    @Autowired
    private IUserDao dao;

    @Override
    public void save(User user) throws ServiceException {
        try {
            dao.save(user);
        } catch (DaoException e) {
            log.error("Error user save in UserService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void update(User user) throws ServiceException {
        try {
            dao.update(user);
        } catch (DaoException e) {
            log.error("Error user update in UserService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(User user) throws ServiceException {
        try {
            dao.delete(user);
        } catch (DaoException e) {
            log.error("Error user delete in UserService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public User get(Serializable id) throws ServiceException {
        User user = null;
        try {
            user = dao.get(id);
            return user;
        } catch (DaoException e) {
            log.error("Error getting user by id in UserService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public User get(String login, String password) throws ServiceException {
        User user = null;
        try {
            user = dao.get(login, password);
            return user;
        } catch (DaoException e) {
            log.error("Error getting user by login and password in UserServiceImpl: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public User getByLogin(String login) throws ServiceException {
        User user = null;
        try {
            user = dao.getByLogin(login);
            return user;
        } catch (DaoException e) {
            log.error("Error getting user by login in UserServiceImpl: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public User getByEmail(String email) throws ServiceException {
        User user = null;
        try {
            user = dao.getByEmail(email);
            return user;
        } catch (DaoException e) {
            log.error("Error getting user by email in UserServiceImpl: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public List<User> getAllUsers() throws ServiceException {
        List<User> users = null;
        try {
            users = dao.getAllUsers();
            return users;
        } catch (DaoException e) {
            log.error("Error getting users in UserServiceImpl: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public List<User> getUsersBySearch(String name, String surname, String patronymic, String email) throws ServiceException {
        List<User> users = null;
        try {
            users = dao.getUsersBySearch(name, surname, patronymic, email);
            return users;
        } catch (DaoException e) {
            log.error("Error getting users in UserServiceImpl: " + e);
            throw new ServiceException(e);
        }
    }
}