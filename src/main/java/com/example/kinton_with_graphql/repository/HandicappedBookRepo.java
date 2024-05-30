package com.example.kinton_with_graphql.repository;

import com.example.kinton_with_graphql.entity.HandicappedBook;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
public interface HandicappedBookRepo extends MongoRepository<HandicappedBook,String> {
}
