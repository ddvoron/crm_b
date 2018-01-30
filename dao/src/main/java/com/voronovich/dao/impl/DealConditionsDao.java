package com.voronovich.dao.impl;

import com.voronovich.dao.IDealConditionsDao;
import com.voronovich.model.DealConditions;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DealConditionsDao extends Dao<DealConditions> implements IDealConditionsDao {

    private Logger log = Logger.getLogger(DealConditionsDao.class);

    @Autowired
    public DealConditionsDao(SessionFactory sessionFactory){
        super(sessionFactory);
    }
}
