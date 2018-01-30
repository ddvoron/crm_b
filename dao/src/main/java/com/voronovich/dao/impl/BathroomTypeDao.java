package com.voronovich.dao.impl;

import com.voronovich.dao.IBathroomTypeDao;
import com.voronovich.model.BathroomType;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BathroomTypeDao extends Dao<BathroomType> implements IBathroomTypeDao {

    private Logger log = Logger.getLogger(BathroomTypeDao.class);

    @Autowired
    public BathroomTypeDao(SessionFactory sessionFactory){
        super(sessionFactory);
    }
}
