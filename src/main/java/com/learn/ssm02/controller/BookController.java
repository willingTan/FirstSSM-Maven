package com.learn.ssm02.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learn.ssm02.entity.Book;
import com.learn.ssm02.service.BookService;

@Controller
@RequestMapping("/Book")
public class BookController {

    @Resource
    BookService bookService;

    @RequestMapping("/getAllBook")
    public String getAllBook(Model model) {
        List<Book> books = bookService.getAllBook();
        for (Book book : books) {
            System.out.println(book.getName());
        }
        
        model.addAttribute("books", books);
        return "Book/index";
    }
}
