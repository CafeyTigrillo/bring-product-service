package com.mipagina.bring_product_service.controller;

import com.mipagina.bring_product_service.model.Product;
import com.mipagina.bring_product_service.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/products/bring-product/{id_product}")
    public Product bringProduct(@PathVariable Long id_product){
        return productService.bringProduct(id_product);
    }
}
