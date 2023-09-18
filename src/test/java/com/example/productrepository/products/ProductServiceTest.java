package com.example.productrepository.products;

import com.example.productrepository.products.models.NewProduct;
import com.example.productrepository.products.models.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ProductServiceTest {

    ProductRepository productRepository = mock(ProductRepository.class);
    ProductService productService = new ProductService(productRepository);


    @Test
    void findAllProducts() {
        //GIVEN
        Product p1 = new Product("1", "product1", 2);
        List<Product> productList = List.of(p1);

        when(productRepository.findAll()).thenReturn(productList);

        //WHEN
        List<Product> actual = productService.findAllProducts();

        //THEN
        List<Product> expected = List.of(new Product("1", "product1", 2));

        verify(productRepository).findAll();
        assertEquals(expected, actual);
    }

    @Test
    void addProduct() {
        //GIVEN

        NewProduct newProduct = new NewProduct("product1", 30);
        Product savedProduct = new Product("123", "product1", 30);

        when(productRepository.save(any())).thenReturn(savedProduct);

        //WHEN
        Product actual = productService.addProduct(newProduct);

        //THEN
        Product expected = new Product("123", "product1", 30);
        verify(productRepository).save(any());
        assertEquals(expected, actual);
    }

    @Test
    void findById(){
        //GIVEN

        //WHEN

        //THEN
    }
}
