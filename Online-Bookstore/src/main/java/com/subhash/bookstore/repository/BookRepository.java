package com.subhash.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhash.bookstore.entity.Book;

/**
 * @author Subhash
 *
 */
public interface BookRepository extends JpaRepository<Book, Long>{

}
