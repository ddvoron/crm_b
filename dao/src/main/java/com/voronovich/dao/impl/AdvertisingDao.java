package com.voronovich.dao.impl;

import com.voronovich.dao.IAdvertisingDao;
import com.voronovich.model.Advertising;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdvertisingDao extends Dao<Advertising> implements IAdvertisingDao {

    private Logger log = Logger.getLogger(AdvertisingDao.class);

    @Autowired
    public AdvertisingDao(SessionFactory sessionFactory){
        super(sessionFactory);
    }
}
