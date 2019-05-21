package com.asiasupermarket.AsiaSupermarketOnlineAPI.product.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private int id;
    private String name;
    private double price;
}
