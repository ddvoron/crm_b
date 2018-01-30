package com.voronovich.dao.impl;

import com.voronovich.dao.ISalesConditionsDao;
import com.voronovich.model.SalesConditions;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SalesConditionsDao extends Dao<SalesConditions> implements ISalesConditionsDao {

    private Logger log = Logger.getLogger(SalesConditionsDao.class);

    @Autowired
    public SalesConditionsDao(SessionFactory sessionFactory){
        super(sessionFactory);
    }
}
