package org.library.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @Resource(name="BookService")
    private org.library.service.BookService bookService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getBooks(Model model) {

        //List<Book> books = bookService.getAll();

        return "home";
    }


}
