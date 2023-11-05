package com.grupojava.virtuallibrarymonolitic.service;

import com.grupojava.virtuallibrarymonolitic.entity.Book;
import com.grupojava.virtuallibrarymonolitic.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;


    @Override
    @Transactional(readOnly = true)
    public List<Book> findAllBooks() {

        return (List<Book>) bookRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Book findBookById(Long id) {

        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public Book saveBook(Book book) {

        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(Book book) {

        return bookRepository.save(book);
    }

    @Override
    public void deleteBookById(Long id) {

        bookRepository.deleteById(id);

    }
}
