package com.kartik.LMS.repository;

import com.kartik.LMS.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BooksRepository extends JpaRepository<Books, Long> {

    List<Books> findByTitle(String title);
    List<Books> findByAuthor(String author);
    List<Books> findByTitleAndAuthor(String title, String author);
}
