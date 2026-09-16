package com.amir.backend.realestate.services;

import com.amir.backend.realestate.domain.entities.Category;

import java.util.List;

public interface CategoryService {
    List<Category> listCategories();
}
