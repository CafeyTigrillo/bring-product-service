package com.mipagina.bring_product_service.controller;

import com.mipagina.bring_product_service.model.Product;
import com.mipagina.bring_product_service.service.IProductService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Product", description = "API for retrieving product details")
public class ProductController {

    @Autowired
    private IProductService productService;

    @Operation(
            summary = "Retrieve a product by ID",
            description = "Fetches product details based on the given product ID.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Product retrieved successfully"),
            }
    )
    @GetMapping("/products/bring-product/{id_product}")
    public Product bringProduct(
            @Parameter(description = "ID of the product to be retrieved", required = true, example = "1")
            @PathVariable Long id_product) {
        return productService.bringProduct(id_product);
    }
}
