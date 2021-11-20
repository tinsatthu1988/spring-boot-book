package com.aptech.springbootbookseller.repository;

import com.aptech.springbootbookseller.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IBookRepository extends JpaRepository<Book, Long> {
}
