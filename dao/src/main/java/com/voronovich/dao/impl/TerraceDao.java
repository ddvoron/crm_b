package com.voronovich.dao.impl;

import com.voronovich.dao.ITerraceDao;
import com.voronovich.model.Terrace;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TerraceDao extends Dao<Terrace> implements ITerraceDao {

    private Logger log = Logger.getLogger(TerraceDao.class);

    @Autowired
    public TerraceDao(SessionFactory sessionFactory){
        super(sessionFactory);
    }
}
