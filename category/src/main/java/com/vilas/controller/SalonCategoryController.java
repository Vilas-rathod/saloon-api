package com.vilas.controller;

import com.vilas.modal.Category;
import com.vilas.payload.dto.SalonDTO;
import com.vilas.service.CategoryService;
import com.vilas.service.clients.SalonFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/categories/salon-owner")
@RequiredArgsConstructor
public class SalonCategoryController {

    private final CategoryService categoryService;
    private final SalonFeignClient salonService;


    @PostMapping
    public ResponseEntity<Category> createCategory(
            @RequestBody Category category,
            @RequestHeader("Authorization") String jwt) throws Exception {
        SalonDTO salon=salonService.getSalonByOwner(jwt).getBody();

        Category savedCategory = categoryService.saveCategory(category, salon);
        return new ResponseEntity<>(savedCategory, HttpStatus.CREATED);
    }
}
