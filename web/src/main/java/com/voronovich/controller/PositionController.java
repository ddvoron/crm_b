package com.voronovich.controller;

import com.voronovich.model.Position;
import com.voronovich.service.exception.ServiceException;
import com.voronovich.service.impl.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RequestMapping("/api/position")
@CrossOrigin("http://localhost:4200")
@Controller
public class PositionController {

    @Autowired
    PositionService service;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<Position>> getPositions() {
        List<Position> list = null;
        try {
            list = service.getAllPositions();
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (ServiceException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
