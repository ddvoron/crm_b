package com.voronovich.dao.impl;

import com.voronovich.dao.ILocationDao;
import com.voronovich.model.Location;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LocationDao extends Dao<Location> implements ILocationDao {

    private Logger log = Logger.getLogger(LocationDao.class);

    @Autowired
    public LocationDao(SessionFactory sessionFactory){
        super(sessionFactory);
    }
}
