package com.voronovich.dao.impl;

import com.voronovich.dao.INoncomSalesDao;
import com.voronovich.model.NoncomSales;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NoncomSalesDao extends Dao<NoncomSales> implements INoncomSalesDao {

    private Logger log = Logger.getLogger(NoncomSalesDao.class);

    @Autowired
    public NoncomSalesDao(SessionFactory sessionFactory){
        super(sessionFactory);
    }
}
