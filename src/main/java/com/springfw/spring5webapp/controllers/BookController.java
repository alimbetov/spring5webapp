package com.springfw.spring5webapp.controllers;


import com.springfw.spring5webapp.repositories.BookRepostory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

   BookRepostory bookRepostory;


    public BookController(BookRepostory bookRepostory) {
        this.bookRepostory = bookRepostory;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){

        model.addAttribute("books",bookRepostory.findAll());

        return "books";
    }


}
