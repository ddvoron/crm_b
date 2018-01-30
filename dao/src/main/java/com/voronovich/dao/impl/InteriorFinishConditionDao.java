package com.voronovich.dao.impl;

import com.voronovich.dao.IInteriorFinishConditionDao;
import com.voronovich.model.InteriorFinishCondition;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class InteriorFinishConditionDao extends Dao<InteriorFinishCondition> implements IInteriorFinishConditionDao {

    private Logger log = Logger.getLogger(InteriorFinishConditionDao.class);

    @Autowired
    public InteriorFinishConditionDao(SessionFactory sessionFactory){
        super(sessionFactory);
    }
}
