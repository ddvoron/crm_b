package com.voronovich.dao.impl;

import com.voronovich.dao.IInteriorFinishDao;
import com.voronovich.model.InteriorFinish;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class InteriorFinishDao extends Dao<InteriorFinish> implements IInteriorFinishDao {

    private Logger log = Logger.getLogger(InteriorFinishDao.class);

    @Autowired
    public InteriorFinishDao(SessionFactory sessionFactory){
        super(sessionFactory);
    }
}
