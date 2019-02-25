package com.liakhovskyi.controller;

import com.liakhovskyi.Request;
import com.liakhovskyi.ViewModel;
import com.liakhovskyi.service.ProductService;

import static java.util.Collections.emptyList;

public class GetProductByIdController implements Controller {

    private final ProductService productService;

    public GetProductByIdController(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public ViewModel process(Request req) {
        String param = req.getParam("p_id")[0];
        Long id = Long.parseLong(param);
        return productService.getById(id)
                .map(p -> ViewModel.of("product").withAttribute("product", p))
                .orElseGet(() -> ViewModel.of("product").withAttribute("product", emptyList()));
    }
}
