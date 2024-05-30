package com.example.kinton_with_graphql.service.impl;

import com.example.kinton_with_graphql.dto.HandicappedBookInput;
import com.example.kinton_with_graphql.entity.HandicappedBook;
import com.example.kinton_with_graphql.repository.HandicappedBookRepo;
import com.example.kinton_with_graphql.service.HandicappedBookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HandicappedBookServiceImpl implements HandicappedBookService {

    private final HandicappedBookRepo handicappedBookRepo;

    public HandicappedBookServiceImpl(HandicappedBookRepo handicappedBookRepo) {
        this.handicappedBookRepo = handicappedBookRepo;
    }

    @Override
    public HandicappedBook saveHandicappedBook(HandicappedBookInput handicappedBookInput) {


            HandicappedBook handicappedBook=new HandicappedBook(
                    handicappedBookInput.getNotebookNumber(),
                    handicappedBookInput.getFullNameHandicapped(),
                    handicappedBookInput.getAddressHandicapped(),
                    handicappedBookInput.getGradeHandicapped(),
                    handicappedBookInput.getDobHandicapped(),
                    handicappedBookInput.getDateOfExpiryHandicapped(),
                    handicappedBookInput.getDateOfIssueHandicapped(),
                    handicappedBookInput.getIsHandicappedUpdate()
            );
            HandicappedBook handicappedBook1= handicappedBookRepo.save(handicappedBook);

        return handicappedBook1;
    }
}
