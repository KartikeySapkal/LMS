package com.kartik.LMS.repository;

import com.kartik.LMS.entity.Books;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class BooksRepositoryTest {

    @Autowired
    private BooksRepository booksRepository;

    @Test
    public void saveBook(){
        Books books = Books.builder()
                .title("Panchatantra")
                .author("Nassarooddin")
                .price(25.00)
                .availability(true)
                .build();

        booksRepository.save(books);
    }

    @Test
    public void printAllBooks(){
        List<Books> booksList = booksRepository.findAll();
        System.out.println("Books List: " + booksList);
    }

    @Test
    public void findBookByTitle(){
        List<Books> b = booksRepository.findByTitle("Panchatantra");
        System.out.println("Books List: " + b);
    }

    @Test
    public void findBookByAuthor(){
        List<Books> b = booksRepository.findByAuthor("Nassarooddin");
        System.out.println("Books List: " + b);
    }

    @Test
    public void findBookByAuthorAndTitle(){
        List<Books> b = booksRepository.findByTitleAndAuthor("Panchatantra", "Nassarooddin");
        System.out.println("Books List: " + b);
    }


}