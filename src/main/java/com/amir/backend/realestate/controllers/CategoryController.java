package com.amir.backend.realestate.controllers;

import com.amir.backend.realestate.domain.dtos.CategoryDto;
import com.amir.backend.realestate.domain.entities.Category;
import com.amir.backend.realestate.mappers.CategoryMapper;
import com.amir.backend.realestate.services.CategoryService;
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
    private final CategoryMapper categoryMapper;
    private final CategoryService categoryService;

    @GetMapping
    public ResponseEntity<List<CategoryDto>> listCategories() {
        // ToDo: Implement the logic to list categories
        List<Category> categories = categoryService.listCategories();
        return ResponseEntity.ok(List.of());
    }
}