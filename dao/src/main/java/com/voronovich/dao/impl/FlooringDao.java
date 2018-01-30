package com.voronovich.dao.impl;

import com.voronovich.dao.IFlooringDao;
import com.voronovich.model.Flooring;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FlooringDao extends Dao<Flooring> implements IFlooringDao {

    private Logger log = Logger.getLogger(FlooringDao.class);

    @Autowired
    public FlooringDao(SessionFactory sessionFactory){
        super(sessionFactory);
    }
}
