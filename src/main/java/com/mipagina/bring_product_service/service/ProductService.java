package com.mipagina.bring_product_service.service;

import com.mipagina.bring_product_service.model.Product;
import com.mipagina.bring_product_service.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService{

    @Autowired
    private IProductRepository productRepository;

    public Product bringProduct(Long id_product){
        return productRepository.findById(id_product).orElse(null);
    }
}
