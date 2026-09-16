package com.amir.backend.realestate.controllers;

import com.amir.backend.realestate.domain.dtos.CategoryDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/categories")
@RequiredArgsConstructor
public class CategoryController {
    @GetMapping
    public ResponseEntity<List<CategoryDto>> listCategories() {
        // ToDo: Implement the logic to list categories
        return ResponseEntity.ok(List.of());
    }
}
