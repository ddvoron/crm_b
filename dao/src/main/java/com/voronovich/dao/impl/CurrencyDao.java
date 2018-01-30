package com.voronovich.dao.impl;

import com.voronovich.dao.ICurrencyDao;
import com.voronovich.model.Currency;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CurrencyDao extends Dao<Currency> implements ICurrencyDao {

    private Logger log = Logger.getLogger(CurrencyDao.class);

    @Autowired
    public CurrencyDao(SessionFactory sessionFactory){
        super(sessionFactory);
    }
}
