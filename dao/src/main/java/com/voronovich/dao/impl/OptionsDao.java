package com.voronovich.dao.impl;

import com.voronovich.dao.IOptionsDao;
import com.voronovich.model.Options;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OptionsDao extends Dao<Options> implements IOptionsDao {

    private Logger log = Logger.getLogger(OptionsDao.class);

    @Autowired
    public OptionsDao(SessionFactory sessionFactory){
        super(sessionFactory);
    }
}
