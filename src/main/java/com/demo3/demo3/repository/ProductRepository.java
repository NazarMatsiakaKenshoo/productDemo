package com.demo3.demo3.repository;

import com.demo3.demo3.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findById(Long productId); // нашо це тут???????
}
