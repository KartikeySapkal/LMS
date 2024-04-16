package com.kartik.LMS.repository;

import com.kartik.LMS.entity.Borrower;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BorrowerRepositoryTest {

    @Autowired
    BorrowerRepository borrowerRepository;

    @Test
    public void getBorrower() {
        Borrower borrower = Borrower.builder()
                .duedate(20042024)
                .returndate(17042024)
                .build();
        borrowerRepository.save(borrower);
    }

    @Test
    public void printAllBorrowers(){
        List<Borrower> borrowerList = borrowerRepository.findAll();
        System.out.println("Borrowers List: " + borrowerList);
    }
}