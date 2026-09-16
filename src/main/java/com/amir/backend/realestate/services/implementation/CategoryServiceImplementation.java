package com.amir.backend.realestate.services.implementation;

import com.amir.backend.realestate.domain.entities.Category;
import com.amir.backend.realestate.repositories.CategoryRepository;
import com.amir.backend.realestate.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImplementation implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> listCategories() {
        return categoryRepository.findAllWithPropertiesCount();
    }
}