package com.voronovich.dao.impl;

import com.voronovich.dao.IBalconyTypeDao;
import com.voronovich.model.BalconyType;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BalconyTypeDao extends Dao<BalconyType> implements IBalconyTypeDao {

    private Logger log = Logger.getLogger(BalconyTypeDao.class);

    @Autowired
    public BalconyTypeDao(SessionFactory sessionFactory){
        super(sessionFactory);
    }
}
