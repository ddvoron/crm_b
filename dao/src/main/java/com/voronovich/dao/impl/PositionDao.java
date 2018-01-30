package com.voronovich.dao.impl;

import com.voronovich.dao.IPositionDao;
import com.voronovich.exception.DaoException;
import com.voronovich.model.Position;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PositionDao extends Dao<Position> implements IPositionDao {

    private Logger log = Logger.getLogger(PositionDao.class);

    @Autowired
    public PositionDao(SessionFactory sessionFactory){
        super(sessionFactory);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Position> getAllPositions() throws DaoException {
        List<Position> positions;
        try {
            Query query = getSession().getNamedQuery("getAllPositions");
            positions = query.list();
            log.info("Got all positions:" + positions);
            return positions;
        } catch (HibernateException e) {
            log.error("Error getting all positions" + e);
            throw new DaoException(e);
        }
    }
}
