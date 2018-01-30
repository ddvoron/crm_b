package com.voronovich.dao.impl;

import com.voronovich.dao.ICountyDao;
import com.voronovich.model.County;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CountyDao extends Dao<County> implements ICountyDao {

    private Logger log = Logger.getLogger(CountyDao.class);

    @Autowired
    public CountyDao(SessionFactory sessionFactory){
        super(sessionFactory);
    }
}
