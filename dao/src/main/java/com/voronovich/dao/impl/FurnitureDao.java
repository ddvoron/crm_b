package com.voronovich.dao.impl;

import com.voronovich.dao.IFurnitureDao;
import com.voronovich.model.Furniture;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FurnitureDao extends Dao<Furniture> implements IFurnitureDao {

    private Logger log = Logger.getLogger(FurnitureDao.class);

    @Autowired
    public FurnitureDao(SessionFactory sessionFactory){
        super(sessionFactory);
    }
}
