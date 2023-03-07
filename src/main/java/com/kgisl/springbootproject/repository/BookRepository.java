package com.kgisl.springbootproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kgisl.springbootproject.entity.Book;

public interface BookRepository  extends JpaRepository<Book,Long> {
    
}
