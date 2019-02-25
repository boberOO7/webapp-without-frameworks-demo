package com.liakhovskyi.controller;

import com.liakhovskyi.Request;
import com.liakhovskyi.ViewModel;
import com.liakhovskyi.service.CategoryService;

public class GetAllCategoriesController implements Controller {

    private final CategoryService categoryService;

    public GetAllCategoriesController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    public ViewModel process(Request req) {
        return ViewModel.of("categories").withAttribute("categories", categoryService.getAll());
    }
}
