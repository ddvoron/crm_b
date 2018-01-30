package com.voronovich.dao.impl;

import com.voronovich.dao.IUserDao;
import com.voronovich.exception.DaoException;
import com.voronovich.model.User;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class UserDao extends Dao<User> implements IUserDao {

    private Logger log = Logger.getLogger(UserDao.class);

    @Autowired
    public UserDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public User getByLogin(String login) throws DaoException {
        User user;
        try {
            Query query = getSession().getNamedQuery("getUsersByLogin")
                    .setParameter("login", login);
            user = (User) query.uniqueResult();
            log.info("Got by login:" + user);
            return user;
        } catch (HibernateException e) {
            log.error("Error getting user by login" + e);
            throw new DaoException(e);
        }
    }

    @Override
    public User getByEmail(String email) throws DaoException {
        User user;
        try {
            Query query = getSession().getNamedQuery("getUsersByEmail")
                    .setParameter("email", email);
            user = (User) query.uniqueResult();
            log.info("Got by email:" + user);
            return user;
        } catch (HibernateException e) {
            log.error("Error getting user by email" + e);
            throw new DaoException(e);
        }
    }

    @Override
    public User get(String login, String password) throws DaoException {
        User user;
        try {
            Query query = getSession().getNamedQuery("getUsersByLoginAndPassword")
                    .setParameter("login", login).setParameter("password", password);
            user = (User) query.uniqueResult();
            log.info("Got by login and password:" + user);
            return user;
        } catch (HibernateException e) {
            log.error("Error getting user by login and password" + e);
            throw new DaoException(e);
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> getAllUsers() throws DaoException {
        List<User> users;
        try {
            Query query = getSession().getNamedQuery("getAllUsers");
            users = query.list();
            log.info("Got all users:" + users);
            return users;
        } catch (HibernateException e) {
            log.error("Error getting all users" + e);
            throw new DaoException(e);
        }
    }

    @Override
    public List<User> getUsersBySearch(String name, String surname, String patronymic, String email) throws DaoException {
        List<User> users;
        try {
            String hgl = "from User u " +
                    "where " +
                    "u.surname like :surname" +
                    " and u.name like :name" +
                    " and u.patronymic like :patronymic" +
                    " and u.email like :email";
            Query query = getSession().createQuery(hgl);
            query.setParameter("name", '%' + name + '%');
            query.setParameter("surname", '%' + surname + '%');
            query.setParameter("patronymic", '%' + patronymic + '%');
            query.setParameter("email",  '%' + email + '%');
            users = query.list();
            return users;
        } catch (HibernateException e) {
            log.error("Error getting users by FIO" + e);
            throw new DaoException(e);
        }
    }
}
