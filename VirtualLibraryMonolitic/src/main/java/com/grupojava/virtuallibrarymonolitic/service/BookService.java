package com.grupojava.virtuallibrarymonolitic.service;

import com.grupojava.virtuallibrarymonolitic.entity.Book;

import java.util.List;

public interface BookService {

    List<Book> findAllBooks();

    Book findBookById(Long id);

    Book saveBook(Book book);

    Book updateBook (Book book);

    void deleteBookById(Long id);
}
