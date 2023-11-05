package com.grupojava.virtuallibrarymonolitic.repository;

import com.grupojava.virtuallibrarymonolitic.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
