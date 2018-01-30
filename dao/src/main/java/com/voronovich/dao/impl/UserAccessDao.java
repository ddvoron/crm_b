package com.voronovich.dao.impl;

import com.voronovich.dao.IUserAccessDao;
import com.voronovich.model.UserAccess;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserAccessDao extends Dao<UserAccess> implements IUserAccessDao {

    private Logger log = Logger.getLogger(UserAccessDao.class);

    @Autowired
    public UserAccessDao(SessionFactory sessionFactory){
        super(sessionFactory);
    }
}
