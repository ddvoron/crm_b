package com.voronovich.service;

import com.voronovich.model.Currency;
import com.voronovich.service.exception.ServiceException;

import java.io.Serializable;

public interface ICurrencyService {

    /**
     * Method saves currency
     *
     * @param currency Currency
     */
    void save(Currency currency) throws ServiceException;

    /**
     * Method updates currency
     *
     * @param currency Currency
     */
    void update(Currency currency) throws ServiceException;

    /**
     * Method removes currency from database
     *
     * @param currency Currency
     */
    void delete(Currency currency) throws ServiceException;

    /**
     * Method gets currency by it's id
     *
     * @param id currency ID
     * @return currency Currency
     */
    Currency get(Serializable id) throws ServiceException;
}
