package com.example.kinton_with_graphql.controller;

import com.example.kinton_with_graphql.dto.HandicappedBookInput;
import com.example.kinton_with_graphql.entity.HandicappedBook;
import com.example.kinton_with_graphql.service.HandicappedBookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@Slf4j
public class HandicappedBookController {
    private final HandicappedBookService handicappedBookService;

    public HandicappedBookController(HandicappedBookService handicappedBookService) {
        this.handicappedBookService = handicappedBookService;
    }
    @MutationMapping(name = "createHandicapped")
    public HandicappedBook createHandicappedBook(@Argument HandicappedBookInput handicappedBookInputs){
//        log.info("Add handicappedBook request received. No of handicapped book requested to add: {}", handicappedBookInputs.size());
        HandicappedBook handicappedBook =handicappedBookService.saveHandicappedBook(handicappedBookInputs);
return handicappedBook;
    }

}
