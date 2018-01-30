package com.voronovich.dao.impl;

import com.voronovich.dao.IWallMaterialDao;
import com.voronovich.model.WallMaterial;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class WallMaterialDao extends Dao<WallMaterial> implements IWallMaterialDao {

    private Logger log = Logger.getLogger(WallMaterialDao.class);

    @Autowired
    public WallMaterialDao(SessionFactory sessionFactory){
        super(sessionFactory);
    }
}
