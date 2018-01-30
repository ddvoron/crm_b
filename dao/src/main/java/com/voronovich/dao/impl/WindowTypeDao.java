package com.voronovich.dao.impl;

import com.voronovich.dao.IWindowTypeDao;
import com.voronovich.model.WindowType;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class WindowTypeDao extends Dao<WindowType> implements IWindowTypeDao {

    private Logger log = Logger.getLogger(WindowTypeDao.class);

    @Autowired
    public WindowTypeDao(SessionFactory sessionFactory){
        super(sessionFactory);
    }
}
