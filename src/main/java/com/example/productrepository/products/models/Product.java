package com.example.productrepository.products.models;

import lombok.With;

@With
public record Product(
        String id,
        String title,
        int price) {
}
