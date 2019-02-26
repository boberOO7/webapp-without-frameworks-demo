package com.liakhovskyi.service;

import com.liakhovskyi.model.Category;
import com.liakhovskyi.model.Product;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    List<Category> getAll();

    Optional<Category> getById(Long id);


}
