/**
 * 
 */
package com.subhash.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhash.bookstore.entity.BookCategory;

/**
 * @author Subhash
 *
 */
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long>{

}
