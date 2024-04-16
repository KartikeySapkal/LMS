package com.kartik.LMS.repository;

import com.kartik.LMS.entity.Borrower;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BorrowerRepositoryTest {

    @Autowired
    BorrowerRepository borrowerRepository;

    @Test
    public void getBorrower() {
        Borrower borrower = Borrower.builder()
    }
}