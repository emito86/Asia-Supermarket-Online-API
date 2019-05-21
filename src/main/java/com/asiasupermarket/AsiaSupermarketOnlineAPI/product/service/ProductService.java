package com.asiasupermarket.AsiaSupermarketOnlineAPI.product.service;

import com.asiasupermarket.AsiaSupermarketOnlineAPI.product.converter.ProductConverter;
import com.asiasupermarket.AsiaSupermarketOnlineAPI.product.entity.ProductEntity;
import com.asiasupermarket.AsiaSupermarketOnlineAPI.product.model.Product;
import com.asiasupermarket.AsiaSupermarketOnlineAPI.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductConverter productConverter;

    public Product getProduct(int productId){

        ProductEntity entity = productRepository.findById(productId);

        return productConverter.convert(entity);
    }

    public Product saveProduct(Product product){

        ProductEntity entity = productRepository.save(productConverter.convert(product));

        return productConverter.convert(entity);
    }
}
