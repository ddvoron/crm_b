package com.voronovich.dao;

import com.voronovich.exception.DaoException;
import com.voronovich.model.Position;

import java.util.List;

public interface IPositionDao extends IDao<Position> {

    /**
     * Method reads the whole list of users
     *
     * @return List<Position>
     * @throws DaoException
     */
    List<Position> getAllPositions() throws DaoException;
}
