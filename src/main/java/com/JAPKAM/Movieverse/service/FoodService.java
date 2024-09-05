package com.JAPKAM.Movieverse.service;

import com.JAPKAM.Movieverse.entity.Food;
import com.JAPKAM.Movieverse.exception.FoodNotFoundException;
import com.JAPKAM.Movieverse.repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodService {
    private FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public List<Food> findAll() {
        return foodRepository.findAll();
    }

    public Food findById(String id) {
        return foodRepository.findById(id).orElseThrow(FoodNotFoundException::new);
    }
}