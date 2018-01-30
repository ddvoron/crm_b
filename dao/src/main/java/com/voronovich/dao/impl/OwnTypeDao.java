package com.voronovich.dao.impl;

import com.voronovich.dao.IOwnTypeDao;
import com.voronovich.model.OwnType;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OwnTypeDao extends Dao<OwnType> implements IOwnTypeDao {

    private Logger log = Logger.getLogger(OwnTypeDao.class);

    @Autowired
    public OwnTypeDao(SessionFactory sessionFactory){
        super(sessionFactory);
    }
}
