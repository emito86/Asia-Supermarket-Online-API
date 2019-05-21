package com.asiasupermarket.AsiaSupermarketOnlineAPI.product.converter;

import com.asiasupermarket.AsiaSupermarketOnlineAPI.product.entity.ProductEntity;
import com.asiasupermarket.AsiaSupermarketOnlineAPI.product.model.Product;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter implements Converter<Product, ProductEntity>{


    @Override
    public ProductEntity convert(Product product) {
        return ProductEntity.builder()
                .name(product.getName())
                .price(product.getPrice())
                .build();
    }

    public Product convert(ProductEntity entity) {
        return Product.builder()
                .name(entity.getName())
                .price(entity.getPrice())
                .build();
    }
}
