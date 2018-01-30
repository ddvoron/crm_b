package com.voronovich.dao.impl;

import com.voronovich.dao.ILevelDao;
import com.voronovich.model.Level;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LevelDao extends Dao<Level> implements ILevelDao {

    private Logger log = Logger.getLogger(LevelDao.class);

    @Autowired
    public LevelDao(SessionFactory sessionFactory){
        super(sessionFactory);
    }
}
