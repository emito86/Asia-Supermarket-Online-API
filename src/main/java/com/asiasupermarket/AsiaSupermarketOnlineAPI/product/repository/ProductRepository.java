package com.asiasupermarket.AsiaSupermarketOnlineAPI.product.repository;

import com.asiasupermarket.AsiaSupermarketOnlineAPI.product.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

    public ProductEntity findById(int id);
}
