package ua.lviv.lgs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import ua.lviv.lgs.services.BookService;

/**
 * Created by Yulian on 05.08.2016.
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/book/all")
    private String allBooks(Model model){
        model.addAttribute("books", bookService.findAll());
        return "views-book-all";
    }

    @RequestMapping(value = "/book/add")
    private String addBook(){
        return "views-book-add";
    }

    @RequestMapping(value = "/book/new", method = RequestMethod.POST)
    private String newBook(@RequestParam("title")String title, @RequestParam("pages")Integer pages, @RequestParam("ganre")String ganre, @RequestParam("image")MultipartFile multipartFile){
        bookService.add(title, pages, ganre, multipartFile);
        return "redirect:/book/all";
    }
}
