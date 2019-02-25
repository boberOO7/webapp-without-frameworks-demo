package com.liakhovskyi.service;

import com.liakhovskyi.model.Product;

import java.util.Optional;

public interface ProductService {

    Optional<Product> getById(Long id);
}
