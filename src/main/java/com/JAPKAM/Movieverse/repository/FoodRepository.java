package com.JAPKAM.Movieverse.repository;

import com.JAPKAM.Movieverse.entity.Food;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends MongoRepository<Food, String> {
}