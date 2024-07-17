package com.example.StorePrecedureTest.service;

import com.example.StorePrecedureTest.dao.BookRepository;
import com.example.StorePrecedureTest.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Transactional
    public List<Book> getBookByStatus(String status) {
        return bookRepository.getBookByStatus(status);
    }

    @Transactional
    public void updateBookStatusById(Long id, String status) {
        bookRepository.updateBookStatusById(id, status);
    }

    @Transactional
    public Integer countBook() {
        return bookRepository.countBook();
    }

}
