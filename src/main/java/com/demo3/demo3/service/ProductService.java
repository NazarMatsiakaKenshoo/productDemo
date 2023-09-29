package com.demo3.demo3.service;

import com.demo3.demo3.dto.ProductDto;
import com.demo3.demo3.exception.ProductNotFount;
import com.demo3.demo3.model.Product;
import com.demo3.demo3.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService {

    private ProductRepository productRepository;

    public Iterable<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product createProduct(ProductDto productDto) {
        Product product = productDto.toProduct();

        Product createdProduct = productRepository.save(product);

        return createdProduct;
    }

    public void removeProduct(Long productId) {
        productRepository.findById(productId).orElseThrow(() -> new ProductNotFount(productId));

        productRepository.deleteById(productId);
    }

    public Product updateProduct(Long productId, ProductDto productDto){
        productRepository.findById(productId).orElseThrow(() -> new ProductNotFount(productId));

        Product product = productDto.toProduct();

        product.setId(productId);

        Product updateproduct = productRepository.save(product);

        return updateproduct;
    }
}
