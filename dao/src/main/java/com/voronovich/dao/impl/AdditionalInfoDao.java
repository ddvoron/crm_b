package com.voronovich.dao.impl;

import com.voronovich.dao.IAdditionalInfoDao;
import com.voronovich.model.AdditionalInfo;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdditionalInfoDao extends Dao<AdditionalInfo> implements IAdditionalInfoDao {

    private Logger log = Logger.getLogger(AdditionalInfoDao.class);

    @Autowired
    public AdditionalInfoDao(SessionFactory sessionFactory){
        super(sessionFactory);
    }
}
