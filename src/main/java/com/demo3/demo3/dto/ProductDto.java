package com.demo3.demo3.dto;


import com.demo3.demo3.entity.BrandEnum;
import com.demo3.demo3.entity.CurrencyEnum;
import com.demo3.demo3.model.Product;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    @NotNull(message = "brand is required")
    private BrandEnum brand;

    @NotEmpty(message = "name is required")
    @Size(min = 4, message = "Name min size is 4")
    private String name;

    @NotNull(message = "price is required")
    private int price;

    @NotNull(message = "currency is required")
    private CurrencyEnum currency;

    public Product toProduct () {
        Product product = new Product(
                this.getBrand(),
                this.getName(),
                this.getPrice(),
                this.getCurrency()
        );

        return product;
    }

    public Product toEditProduct (Long productId) {
        Product product = new Product(
                productId,
                this.getBrand(),
                this.getName(),
                this.getPrice(),
                this.getCurrency()
        );

        return product;
    }
}
