package com.kartik.LMS.repository;

import com.kartik.LMS.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PubRepository extends JpaRepository<Publisher, Long> {

}
