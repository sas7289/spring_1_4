package com.example.lesson_4.util;

import com.example.lesson_4.dto.ProductDto;
import com.example.lesson_4.model.Product;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ConverterUtil {

    public static Product dtoToProduct(ProductDto productDto) {
        return new Product(productDto.getId(), productDto.getTitle(), productDto.getCost(), 1, false);
    }

    public static ProductDto productToDto(Product product) {
        return new ProductDto(product.getId(), product.getTitle(), product.getCost());
    }
}
