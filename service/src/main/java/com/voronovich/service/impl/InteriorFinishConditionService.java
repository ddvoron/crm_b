package com.voronovich.service.impl;

import com.voronovich.dao.IInteriorFinishConditionDao;
import com.voronovich.exception.DaoException;
import com.voronovich.model.InteriorFinishCondition;
import com.voronovich.service.IInteriorFinishConditionService;
import com.voronovich.service.exception.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service("interiorFinishConditionService")
@Transactional
public class InteriorFinishConditionService implements IInteriorFinishConditionService {

    private static Logger log = Logger.getLogger(InteriorFinishConditionService.class);

    @Autowired
    private IInteriorFinishConditionDao dao;

    @Override
    public void save(InteriorFinishCondition interiorFinishCondition) throws ServiceException {
        try {
            dao.save(interiorFinishCondition);
        } catch (DaoException e) {
            log.error("Error interiorFinishCondition save in InteriorFinishConditionService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void update(InteriorFinishCondition interiorFinishCondition) throws ServiceException {
        try {
            dao.update(interiorFinishCondition);
        } catch (DaoException e) {
            log.error("Error interiorFinishCondition update in InteriorFinishConditionService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(InteriorFinishCondition interiorFinishCondition) throws ServiceException {
        try {
            dao.delete(interiorFinishCondition);
        } catch (DaoException e) {
            log.error("Error interiorFinishCondition delete in InteriorFinishConditionService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public InteriorFinishCondition get(Serializable id) throws ServiceException {
        try {
            return dao.get(id);
        } catch (DaoException e) {
            log.error("Error getting interiorFinishCondition by id in InteriorFinishConditionService: " + e);
            throw new ServiceException(e);
        }
    }
}