package com.example.kinton_with_graphql.service;

import com.example.kinton_with_graphql.dto.HandicappedBookInput;
import com.example.kinton_with_graphql.entity.HandicappedBook;

import java.util.List;

public interface HandicappedBookService {
    HandicappedBook saveHandicappedBook(HandicappedBookInput handicappedBookInputs);
}
