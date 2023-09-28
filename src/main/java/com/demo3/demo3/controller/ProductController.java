package com.demo3.demo3.controller;

import com.demo3.demo3.dto.ProductDto;
import com.demo3.demo3.model.Product;
import com.demo3.demo3.service.ProductService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    @GetMapping
    public Iterable<Product> getProducts() {
        Iterable<Product> products = productService.getProducts();

        return products;
    }

    @PostMapping
    public Product createProduct(@Valid @RequestBody ProductDto productDto){

        Product createdProduct = productService.createProduct(productDto);

        return createdProduct;
    }

    @PutMapping("/{productId}")
    public Product updateProduct(@PathVariable("productId") Long productId, @RequestBody ProductDto productDto) {
        Product createdProduct = productService.updateProduct(productId, productDto);

        return createdProduct;
    }

    @DeleteMapping("/{productId}")
    public String removeProduct(@PathVariable("productId") Long productId) {
        productService.removeProduct(productId);

        return "success";
    }

}
