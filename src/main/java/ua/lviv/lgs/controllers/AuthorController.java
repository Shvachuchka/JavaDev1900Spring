package ua.lviv.lgs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.lviv.lgs.entity.Author;
import ua.lviv.lgs.services.AuthorService;

import java.util.List;

/**
 * Created by Yulian on 20.07.2016.
 */
@Controller
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @RequestMapping(value = "/authors/all", method = RequestMethod.GET)
    public String allAuthors(Model model){
        List<Author> authorList = authorService.findAll();
        model.addAttribute("authors", authorList);
        return "allAuthors";
    }

    @RequestMapping(value = "/author/new", method = RequestMethod.GET)
    private String authorNew(){
        return "newAuthor";
    }

    @RequestMapping(value = "/author/create", method = RequestMethod.POST)
    public String createAuthor(@RequestParam("name")String name,@RequestParam("secondname")String secondname, @RequestParam("country")String country,@RequestParam("age")Integer age){
        authorService.add(name,secondname,country,age);
        return "redirect:/authors/all";
    }

}
