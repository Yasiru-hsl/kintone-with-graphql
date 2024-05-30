package com.example.kinton_with_graphql.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document
public class HandicappedBook {
    private String notebookNumber;
    private String fullNameHandicapped;
    private String addressHandicapped;
    private String gradeHandicapped;
    private LocalDate dobHandicapped;
    private LocalDate dateOfExpiryHandicapped;
    private LocalDate dateOfIssueHandicapped;
    private Boolean isHandicappedUpdate;

}
