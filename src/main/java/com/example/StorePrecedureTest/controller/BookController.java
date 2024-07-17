package com.example.StorePrecedureTest.controller;

import com.example.StorePrecedureTest.entity.Book;
import com.example.StorePrecedureTest.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books/{status}")
    public List<Book> getBookByStatus(@PathVariable String status) {
        return bookService.getBookByStatus(status);
    }

    @GetMapping("/books/{id}/{status}")
    public void updateBookStatusById(@PathVariable String id, @PathVariable String status) {
        bookService.updateBookStatusById(Long.valueOf(id), status);
    }

    @GetMapping("/books/count")
    public Integer countBook() {
        return bookService.countBook();
    }

}
