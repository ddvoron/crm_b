package com.voronovich.controller;

import com.voronovich.hash.Sha256;
import com.voronovich.model.User;
import com.voronovich.service.IAccessService;
import com.voronovich.service.IPositionService;
import com.voronovich.service.IUserAccessService;
import com.voronovich.service.IUserService;
import com.voronovich.service.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

@Controller
@RequestMapping(value = "/api/auth")
@CrossOrigin("http://localhost:4200")
public class AuthController {

    @Autowired
    IUserService userService;


    private static final String STATIC_SALT = ResourceBundle.getBundle("staticValue", Locale.US).getString("staticValue");
    private static final int LENGTH_RANDOM_NUMBER = 20;

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<User> login(@RequestBody User user) {
        try {
            User auth = userService.getByLogin(user.getLogin());
            if (auth != null) {
                String salt = userService.getByLogin(user.getLogin()).getSalt();
                String password1 = Sha256.sha256(user.getPassword() + salt + STATIC_SALT);
                auth = userService.get(user.getLogin(), password1);
                if (auth == null) {
                    return new ResponseEntity<>(new User(), HttpStatus.OK);
                } else {
                    return new ResponseEntity<>(auth, HttpStatus.OK);
                }
            } else {
                return new ResponseEntity<>(new User(), HttpStatus.OK);
            }
        } catch (ServiceException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}