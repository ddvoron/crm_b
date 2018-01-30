package com.voronovich.service.impl;

import com.voronovich.dao.IPositionDao;
import com.voronovich.exception.DaoException;
import com.voronovich.model.Position;
import com.voronovich.service.IPositionService;
import com.voronovich.service.exception.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Service("positionService")
@Transactional
public class PositionService implements IPositionService {

    private static Logger log = Logger.getLogger(PositionService.class);

    @Autowired
    private IPositionDao dao;

    @Override
    public void save(Position position) throws ServiceException {
        try {
            dao.save(position);
        } catch (DaoException e) {
            log.error("Error position save in PositionService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void update(Position position) throws ServiceException {
        try {
            dao.update(position);
        } catch (DaoException e) {
            log.error("Error position update in PositionService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(Position position) throws ServiceException {
        try {
            dao.delete(position);
        } catch (DaoException e) {
            log.error("Error position delete in PositionService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public Position get(Serializable id) throws ServiceException {
        Position position = null;
        try {
            position = dao.get(id);
            return position;
        } catch (DaoException e) {
            log.error("Error getting position by id in PositionService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public List<Position> getAllPositions() throws ServiceException {
        List<Position> positions = null;
        try {
            positions = dao.getAllPositions();
        } catch (DaoException e) {
            log.error("Error getting positions in PositionServiceImpl: " + e);
            throw new ServiceException(e);
        }
        return positions;
    }
}