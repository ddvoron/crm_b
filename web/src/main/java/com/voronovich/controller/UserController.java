package com.voronovich.controller;

import com.voronovich.hash.RandomSalt;
import com.voronovich.hash.Sha256;
import com.voronovich.mail.Sender;
import com.voronovich.model.User;
import com.voronovich.service.IUserService;
import com.voronovich.service.exception.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(value = "/api/user")
@CrossOrigin("http://localhost:4200")
public class UserController {


    @Autowired
    IUserService userService;

    private static final String STATIC_SALT = ResourceBundle.getBundle("staticValue", Locale.US).getString("staticValue");
    private static final int LENGTH_RANDOM_NUMBER = 20;
    private static final int LENGTH_RANDOM_NUMBER_LOG_PASS = 7;
    private static final String ADMIN_MAIL = ResourceBundle.getBundle("data").getString("mail");
    private static final String ADMIN_PASSWORD = ResourceBundle.getBundle("data").getString("password");
    private static final String MESSAGE_SUBJECT = "Данные для доступа в CRM";

    Sender sslSender = new Sender(ADMIN_MAIL, ADMIN_PASSWORD);

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<User> add(@RequestBody User user) {
        String login = "";
        String password = RandomSalt.csRandomAlphaNumericString(LENGTH_RANDOM_NUMBER_LOG_PASS);
        String salt = RandomSalt.csRandomAlphaNumericString(LENGTH_RANDOM_NUMBER);
        String password1 = Sha256.sha256(password + salt + STATIC_SALT);
        boolean flag = true;
        try {
            while (flag) {
                login = RandomSalt.csRandomAlphaNumericString(LENGTH_RANDOM_NUMBER_LOG_PASS);
                if (userService.getByLogin(login) == null) {
                    user.setLogin(login);
                    user.setPassword(password1);
                    user.setSalt(salt);
                    user.setActive(true);
                    user.setRegistrationDate(new Date());
                    userService.save(user);
                    flag = false;
                }
            }
            if (userService.getByLogin(login) != null) {
                sslSender.send(MESSAGE_SUBJECT, user.getLogin() + "/" + password, user.getEmail());
                return new ResponseEntity<>(userService.getByLogin(login), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
            }
        } catch (ServiceException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> list = null;
        try {
            list = userService.getAllUsers();
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (ServiceException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<User> getUserById(@PathVariable int id) {
        User user = new User();
        try {
            user = userService.get(id);
            return new ResponseEntity<>(user, HttpStatus.OK);
        } catch (ServiceException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity<User> delete(@PathVariable int id) {
        try {
            User user = userService.get(id);
            userService.delete(user);
            return new ResponseEntity<>(user, HttpStatus.OK);
        } catch (ServiceException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
    public ResponseEntity<User> update(@RequestBody User user) {
        try {
            userService.update(user);
            return new ResponseEntity<>(user, HttpStatus.OK);
        } catch (ServiceException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<User>> getUsersBySearch(@RequestParam("name") String name,
                                                       @RequestParam("surname") String surname,
                                                       @RequestParam("patronymic") String patronymic,
                                                       @RequestParam("email") String email) {
        List<User> list = null;
        try {
                list = userService.getUsersBySearch(name, surname, patronymic, email);
            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (ServiceException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
