package com.voronovich.controller;

import com.voronovich.dao.IFlooringDao;
import com.voronovich.dao.IFurnitureDao;
import com.voronovich.dao.IInteriorFinishConditionDao;
import com.voronovich.dao.IWindowTypeDao;
import com.voronovich.model.*;
import com.voronovich.service.*;
import com.voronovich.service.exception.ServiceException;
import com.voronovich.service.impl.AdditionalInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/api/do")
@CrossOrigin("http://localhost:4200")
public class TestController {

    @Autowired
    INoncomSalesService noncomSalesService;
    @Autowired
    ILocationService locationService;
    @Autowired
    ICountyService countyService;
    @Autowired
    IMetroService metroService;
    @Autowired
    IOptionsService optionsService;
    @Autowired
    IBathroomTypeService bathroomTypeService;
    @Autowired
    IWallMaterialService wallMaterialService;
    @Autowired
    IHouseTypeService houseTypeService;
    @Autowired
    IWindowTypeService windowTypeService;
    @Autowired
    IBalconyTypeService balconyTypeService;
    @Autowired
    ITerraceService terraceService;
    @Autowired
    ILevelService levelService;
    @Autowired
    IInteriorFinishConditionService iInteriorFinishConditionService;
    @Autowired
    IInteriorFinishOptionService iInteriorFinishOptionService;
    @Autowired
    IInteriorFinishService iInteriorFinishService;
    @Autowired
    IFlooringService flooringServicel;
    @Autowired
    IFurnitureService furnitureServicel;
    @Autowired
    IWindowMaterialService windowMaterialService;
    @Autowired
    IAdditionalInfoService additionalInfoService;
    @Autowired
    ICurrencyService currencyService;
    @Autowired
    IOwnTypeService ownTypeService;
    @Autowired
    ISalesConditionsService salesConditionsService;
    @Autowired
    IDealConditionsService dealConditionsService;
    @Autowired
    IAdvertisingService advertisingService;


    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity getAllUsers() {
        try {
            noncomSalesService.delete(noncomSalesService.get(1));
            return new ResponseEntity(HttpStatus.OK);
        } catch (ServiceException e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
