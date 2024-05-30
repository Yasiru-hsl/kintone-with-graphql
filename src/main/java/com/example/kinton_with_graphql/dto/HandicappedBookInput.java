package com.example.kinton_with_graphql.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HandicappedBookInput {
    private String notebookNumber;
    private String fullNameHandicapped;
    private String addressHandicapped;
    private String gradeHandicapped;
    private LocalDate dobHandicapped;
    private LocalDate dateOfExpiryHandicapped;
    private LocalDate dateOfIssueHandicapped;
    private Boolean isHandicappedUpdate;

}
