package com.grupojava.virtuallibrarymonolitic.controller;

import com.grupojava.virtuallibrarymonolitic.entity.Book;
import com.grupojava.virtuallibrarymonolitic.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<Book> findAllBooks () {

        return bookService.findAllBooks();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Book findBookById(@PathVariable Long id) {

        return bookService.findBookById(id);

    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Book saveBooks (@RequestBody Book book) {

        return bookService.saveBook(book);
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    public Book updateBook (@RequestBody Book book) {

        return bookService.updateBook(book);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void deleteBookById(@PathVariable Long id) {

        bookService.deleteBookById(id);
    }

}
