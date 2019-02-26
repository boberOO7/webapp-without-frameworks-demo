package com.liakhovskyi.service;

import com.liakhovskyi.model.Category;
import com.liakhovskyi.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CategoryServiceImpl implements CategoryService {

    private static List<Category> categories = new ArrayList<>();

    static {
        List<Product> products1 = new ArrayList<>();
        Product product = new Product(1L,"iPhone Xs Max", "Apple product", 999.99);
        Product product2 = new Product(2L,"Samsung Galaxy S10", "Korean product", 700.99);
        Product product3 = new Product(3L,"Nokia 9", "Finnish product", 700.99);
        products1.add(product);
        products1.add(product2);
        products1.add(product3);
        Category category = new Category(1L, "Mobile Phones", "Best ever phones");
        category.setProducts(products1);

        List<Product> products2 = new ArrayList<>();
        Product product4 = new Product(4L,"MacBook Pro 15.4", "Apple product", 7426.66);
        Product product5 = new Product(5L,"MSI GT75 Titan 8RG", "MSI product", 5941.33);
        Product product6 = new Product(6L,"Dream Machines Clevo X1070-15", "Dream Machines product", 2747.86);
        products2.add(product4);
        products2.add(product5);
        products2.add(product6);
        Category category2 = new Category(2L, "Laptops", "Best ever laptops");
        category2.setProducts(products2);

        List<Product> products3 = new ArrayList<>();
        Product product7 = new Product(7L,"Sony KD75ZF9BR2 Black", "Sony product", 9271.79);
        Product product8 = new Product(8L,"LG OLED65W8PLA", "LG product", 9271.79);
        Product product9 = new Product(9L,"Samsung QE75Q9FNAUXUA", "Samsung product", 6490.26);
        products3.add(product7);
        products3.add(product8);
        products3.add(product9);
        Category category3 = new Category(3L, "TVs", "Best ever TVs");
        category3.setProducts(products3);

        categories.add(category);
        categories.add(category2);
        categories.add(category3);
    }

    @Override
    public List<Category> getAll() {
        return categories;
    }

    @Override
    public Optional<Category> getById(Long id) {
        return categories.stream().filter(c -> c.getId().equals(id)).findFirst();
    }

    public static List<Product> getAllProducts() {
            return categories.stream().flatMap(c -> c.getProducts().stream()).collect(Collectors.toList());
    }
}
