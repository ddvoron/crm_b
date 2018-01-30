package com.voronovich.dao;

import com.voronovich.exception.DaoException;
import com.voronovich.model.User;

import java.util.Date;
import java.util.List;

public interface IUserDao extends IDao<User> {

    /**
     * Method reads user by it's login and password
     *
     * @param login user login
     * @param password user password
     * @return User
     * @throws DaoException
     */
    User get(String login, String password) throws DaoException;

    /**
     * Method reads user by it's login
     *
     * @param login user login
     * @return User
     * @throws DaoException
     */
    User getByLogin(String login) throws DaoException;

    /**
     * Method reads user by it's email
     *
     * @param email user login
     * @return UserEntity
     * @throws DaoException
     */
    User getByEmail(String email) throws DaoException;

    /**
     * Method reads the whole list of users
     *
     * @return List<User>
     * @throws DaoException
     */
    List<User> getAllUsers() throws DaoException;

    /**
     * Method reads the list of users whose name is like FIO
     *
     * @return List<User>
     * @throws DaoException
     */
    List<User> getUsersBySearch(String name, String surname, String patronymic, String email) throws DaoException;
}
