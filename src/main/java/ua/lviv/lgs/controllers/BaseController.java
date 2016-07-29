package ua.lviv.lgs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.lviv.lgs.entity.Author;
import ua.lviv.lgs.services.AuthorService;

import java.util.List;

/**
 * Created by Yulian on 15.07.2016.
 */
@Controller
public class BaseController {

    @Autowired
    private AuthorService authorService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(){
        return "home";
    }

    @RequestMapping(value = "/loginpage", method = RequestMethod.GET)
    public String login(){
        return "login";
    }
}
