package com.kartik.LMS.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
        uniqueConstraints = @UniqueConstraint(
                name = "book_name_unique",
                columnNames = "title"  // Change this to match the column name
        )
)
public class Books {
    @Id
    @SequenceGenerator(
            name = "book_sequence",
            sequenceName = "book_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "book_sequence"
    )
    private long book_id;

    @Column(
            name= "title",  // Change this to match the column name
            nullable = false
    )
    private String title;
    private String author;
    private double price;
    private boolean availability;

}
