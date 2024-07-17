package com.example.StorePrecedureTest.dao;

import com.example.StorePrecedureTest.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Procedure(name = "GetBookByStatus")
    List<Book> getBookByStatus(@Param("status") String status);

    @Procedure(name = "UpdateBookStatusById")
    void updateBookStatusById(@Param("id") Long id, @Param("status") String status);

    @Procedure(name = "CountBook")
    Integer countBook();

}
