package ua.lviv.lgs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ua.lviv.lgs.entity.Author;
import ua.lviv.lgs.services.AuthorService;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
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
        return "views-author-all";
    }

    @RequestMapping(value = "/author/new", method = RequestMethod.GET)
    private String authorNew(Model model){
        model.addAttribute("author", new Author());
        return "views-author-new";
    }

/*    @RequestMapping(value = "/author/create", method = RequestMethod.POST)
    public String createAuthor(@RequestParam("name")String name,@RequestParam("secondname")String secondname, @RequestParam("country")String country,@RequestParam("age")Integer age){
        authorService.add(name,secondname,country,age);
        return "redirect:/authors/all";
    }*/

    @RequestMapping(value = "/author/create", method = RequestMethod.POST)
    public String createAuthor(@ModelAttribute Author author){
        authorService.addOrEdit(author);
        return "redirect:/authors/all";
    }

    @RequestMapping(value = "/author/page/{id}", method = RequestMethod.GET)
    public String authorPage(@PathVariable String id, Model model){
        Author author = authorService.findOne(Integer.parseInt(id));
        model.addAttribute("author", author);
        return "views-author-page";
    }

    @RequestMapping(value = "/author/edit/{id}", method = RequestMethod.GET)
    public String edit(@PathVariable String id, Model model){
        model.addAttribute("author", authorService.findOne(Integer.parseInt(id)));
        return "views-author-edit";
    }

/*    @RequestMapping(value = "/test/{id}", method = RequestMethod.GET)
    public String addToBasket(HttpSession httpSession, @PathVariable String id){
        List<Author>authors = (List<Author>)httpSession.getAttribute("authors");
        Author author = authorService.findOne(Integer.parseInt(id));
        if(authors == null){
            authors = new ArrayList<Author>();
        }
        authors.add(author);
        System.out.println(authors);
        httpSession.setAttribute("authors", authors);
        return "redirect:/authors/all";
    }*/

    @RequestMapping(value = "/author/edit", method = RequestMethod.POST)
    public String edit(@ModelAttribute Author author){
        authorService.addOrEdit(author);
        return "redirect:/author/page/"+String.valueOf(author.getId());
    }

    @RequestMapping(value = "/author/delete/{id}", method = RequestMethod.POST)
    public String delete(@PathVariable String id){
        authorService.delete(Integer.parseInt(id));
        return "redirect:/authors/all";
    }
}
