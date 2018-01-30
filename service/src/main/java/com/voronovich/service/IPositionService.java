package com.voronovich.service;

import com.voronovich.model.Position;
import com.voronovich.service.exception.ServiceException;

import java.io.Serializable;
import java.util.List;

public interface IPositionService {

    /**
     * Method saves position
     *
     * @param position Position
     */
    void save(Position position) throws ServiceException;

    /**
     * Method updates position
     *
     * @param position Position
     */
    void update(Position position) throws ServiceException;

    /**
     * Method removes position from database
     *
     * @param position Position
     */
    void delete(Position position) throws ServiceException;

    /**
     * Method gets position by it's id
     *
     * @param id position ID
     * @return position Position
     */
    Position get(Serializable id) throws ServiceException;

    /**
     * Method reads the whole list of users
     *
     * @return List<User>
     */
    List<Position> getAllPositions() throws ServiceException;
}
