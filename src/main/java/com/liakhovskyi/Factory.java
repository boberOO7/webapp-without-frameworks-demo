package com.liakhovskyi;

import com.liakhovskyi.controller.GetAllCategoriesController;
import com.liakhovskyi.controller.GetCategoryByIdController;
import com.liakhovskyi.controller.GetProductByIdController;
import com.liakhovskyi.controller.LoginUserController;
import com.liakhovskyi.service.*;

public class Factory {

    public static LoginUserController getLoginUserController(UserService userService) {
        return new LoginUserController(userService);
    }

    public static UserService getUserServiceImpl() {
        return new UserServiceImpl();
    }

    public static GetAllCategoriesController getGetAllCategoriesController(CategoryService categoryService) {
        return new GetAllCategoriesController(categoryService);
    }

    public static CategoryService getCategoryService() {
        return new CategoryServiceImpl();
    }

    public static GetCategoryByIdController getGetCategoryByIdController(CategoryService categoryService) {
        return new GetCategoryByIdController(categoryService);
    }

    public static ProductService getProductService() {
        return new ProductServiceImpl();
    }

    public static GetProductByIdController getGetProductByIdController(ProductService productService) {
        return new GetProductByIdController(productService);
    }
}
