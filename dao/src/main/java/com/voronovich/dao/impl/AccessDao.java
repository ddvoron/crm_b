package com.voronovich.dao.impl;

import com.voronovich.dao.IAccessDao;
import com.voronovich.model.Access;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccessDao extends Dao<Access> implements IAccessDao {

    private Logger log = Logger.getLogger(AccessDao.class);

    @Autowired
    public AccessDao(SessionFactory sessionFactory){
        super(sessionFactory);
    }
}
