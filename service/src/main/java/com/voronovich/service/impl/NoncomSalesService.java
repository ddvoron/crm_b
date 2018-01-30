package com.voronovich.service.impl;

import com.voronovich.dao.INoncomSalesDao;
import com.voronovich.exception.DaoException;
import com.voronovich.model.NoncomSales;
import com.voronovich.service.INoncomSalesService;
import com.voronovich.service.exception.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service("noncomSalesService")
@Transactional
public class NoncomSalesService implements INoncomSalesService {

    private static Logger log = Logger.getLogger(NoncomSalesService.class);

    @Autowired
    private INoncomSalesDao dao;

    @Override
    public void save(NoncomSales noncomSales) throws ServiceException {
        try {
            dao.save(noncomSales);
        } catch (DaoException e) {
            log.error("Error noncomSales save in NoncomSalesService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void update(NoncomSales noncomSales) throws ServiceException {
        try {
            dao.update(noncomSales);
        } catch (DaoException e) {
            log.error("Error noncomSales update in NoncomSalesService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(NoncomSales noncomSales) throws ServiceException {
        try {
            dao.delete(noncomSales);
        } catch (DaoException e) {
            log.error("Error noncomSales delete in NoncomSalesService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public NoncomSales get(Serializable id) throws ServiceException {
        NoncomSales noncomSales = null;
        try {
            noncomSales = dao.get(id);
            return noncomSales;
        } catch (DaoException e) {
            log.error("Error getting noncomSales by id in NoncomSalesService: " + e);
            throw new ServiceException(e);
        }
    }
}