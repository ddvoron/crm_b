package com.voronovich.dao.impl;

import com.voronovich.dao.IWindowMaterialDao;
import com.voronovich.model.WindowMaterial;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class WindowMaterialDao extends Dao<WindowMaterial> implements IWindowMaterialDao {

    private Logger log = Logger.getLogger(WindowMaterialDao.class);

    @Autowired
    public WindowMaterialDao(SessionFactory sessionFactory){
        super(sessionFactory);
    }
}
