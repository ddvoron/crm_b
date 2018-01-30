package com.voronovich.service.impl;

import com.voronovich.dao.ICurrencyDao;
import com.voronovich.exception.DaoException;
import com.voronovich.model.Currency;
import com.voronovich.service.ICurrencyService;
import com.voronovich.service.exception.ServiceException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

@Service("currencyService")
@Transactional
public class CurrencyService implements ICurrencyService {

    private static Logger log = Logger.getLogger(CurrencyService.class);

    @Autowired
    private ICurrencyDao dao;

    @Override
    public void save(Currency currency) throws ServiceException {
        try {
            dao.save(currency);
        } catch (DaoException e) {
            log.error("Error currency save in CurrencyService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void update(Currency currency) throws ServiceException {
        try {
            dao.update(currency);
        } catch (DaoException e) {
            log.error("Error currency update in CurrencyService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public void delete(Currency currency) throws ServiceException {
        try {
            dao.delete(currency);
        } catch (DaoException e) {
            log.error("Error currency delete in CurrencyService: " + e);
            throw new ServiceException(e);
        }
    }

    @Override
    public Currency get(Serializable id) throws ServiceException {
        try {
            return dao.get(id);
        } catch (DaoException e) {
            log.error("Error getting currency by id in CurrencyService: " + e);
            throw new ServiceException(e);
        }
    }
}