package com.voronovich.dao.impl;

import com.voronovich.dao.IMetroDao;
import com.voronovich.model.Metro;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MetroDao extends Dao<Metro> implements IMetroDao {

    private Logger log = Logger.getLogger(MetroDao.class);

    @Autowired
    public MetroDao(SessionFactory sessionFactory){
        super(sessionFactory);
    }
}
