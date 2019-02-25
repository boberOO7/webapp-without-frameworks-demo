package com.liakhovskyi.service;

import com.liakhovskyi.model.Product;

import java.util.List;
import java.util.Optional;

public class ProductServiceImpl implements ProductService {

    private static List<Product> products;

    static {
        CategoryServiceImpl categoryServiceImpl = new CategoryServiceImpl();
        products = categoryServiceImpl.getAllProducts();
    }

    @Override
    public Optional<Product> getById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst();
    }
}
