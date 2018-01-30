package com.voronovich.dao.impl;

import com.voronovich.dao.IHouseTypeDao;
import com.voronovich.model.HouseType;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HouseTypeDao extends Dao<HouseType> implements IHouseTypeDao {

    private Logger log = Logger.getLogger(HouseTypeDao.class);

    @Autowired
    public HouseTypeDao(SessionFactory sessionFactory){
        super(sessionFactory);
    }
}
