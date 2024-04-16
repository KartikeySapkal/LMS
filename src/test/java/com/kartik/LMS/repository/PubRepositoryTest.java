package com.kartik.LMS.repository;

import com.kartik.LMS.entity.Publisher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class PubRepositoryTest {

    @Autowired
    private PubRepository pubRepository;

    @Test
    public void savePublisher() {
        Publisher publisher = Publisher.builder()
                .pub_name("Nachiket Sapkal")
                .pub_address("Pune")
                .build();

        pubRepository.save(publisher);
    }
    @Test
    public void printAllBooks(){
        List<Publisher> pubList = pubRepository.findAll();
        System.out.println("Publishers List: " + pubList);
    }

}

