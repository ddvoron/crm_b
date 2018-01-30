package com.voronovich.service;

import com.voronovich.model.User;
import com.voronovich.service.exception.ServiceException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public interface IUserService {

    /**
     * Method saves user
     *
     * @param user User
     */
    void save(User user) throws ServiceException;

    /**
     * Method updates user
     *
     * @param user User
     */
    void update(User user) throws ServiceException;

    /**
     * Method removes user from database
     *
     * @param user User
     */
    void delete(User user) throws ServiceException;

    /**
     * Method gets user by it's id
     *
     * @param id user ID
     * @return user User
     */
    User get(Serializable id) throws ServiceException;

    /**
     * Method reads user by it's login and password
     *
     * @param login user login
     * @param password user password
     * @return user User
     */
    User get(String login, String password) throws ServiceException;

    /**
     * Method reads user by it's login
     *
     * @param login user login
     * @return user User
     */
    User getByLogin(String login) throws ServiceException;

    /**
     * Method reads user by it's email
     *
     * @param email user login
     * @return user User
     */
    User getByEmail(String email) throws ServiceException;

    /**
     * Method reads the whole list of users
     *
     * @return List<User>
     */
    List<User> getAllUsers() throws ServiceException;

    /**
     * Method reads the list of users whose name is like FIO
     *
     * @return List<User>
     * @throws ServiceException
     */
    List<User> getUsersBySearch(String name, String surname, String patronymic, String email) throws ServiceException;
}

