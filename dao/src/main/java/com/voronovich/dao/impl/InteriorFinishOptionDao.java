package com.voronovich.dao.impl;

import com.voronovich.dao.IInteriorFinishOptionDao;
import com.voronovich.model.InteriorFinishOption;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class InteriorFinishOptionDao extends Dao<InteriorFinishOption> implements IInteriorFinishOptionDao {

    private Logger log = Logger.getLogger(InteriorFinishOptionDao.class);

    @Autowired
    public InteriorFinishOptionDao(SessionFactory sessionFactory){
        super(sessionFactory);
    }
}
