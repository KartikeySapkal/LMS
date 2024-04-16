package com.kartik.LMS.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Borrower {
   @Id
   @SequenceGenerator(
           name = "issue_sequence",
           allocationSize = 1,
           initialValue = 100,
           sequenceName = "issue_sequence"
   )
   @GeneratedValue(
           strategy = GenerationType.SEQUENCE,
           generator = "issue_sequence"
   )
    private long issueID;
    private LocalDate duedate;
    private LocalDate returndate;


}
