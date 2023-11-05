package com.grupojava.virtuallibrarymonolitic.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "books")
@Getter
@Setter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String code;

    @Column(unique = true)
    private String isbn;

    private String title;

    private String autor;

    /*@Column(name = "edition_date")*/
    private LocalDate editionDate;


}
