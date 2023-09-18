package com.example.productrepository.products;

import com.example.productrepository.products.models.NewProduct;
import com.example.productrepository.products.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    public Product addProduct(NewProduct newProduct) {
        Product product = new Product(
                UUID.randomUUID().toString(),
                newProduct.title(),
                newProduct.price()
                );
        return productRepository.save(product);
    }

    public Optional<Product> findProductById(String id) {
        return productRepository.findById(id);
    }

    public Optional<Product> updateProdukt(Product product) {
        Optional<Product> findProduct = productRepository.findById(product.id());
        if (findProduct.isPresent()) {
            Product saveProdukt = findProduct.get();
            saveProdukt = saveProdukt.withTitle(product.title());
            saveProdukt = saveProdukt.withPrice(product.price());
            return Optional.of(productRepository.save(saveProdukt));
        }
        return Optional.empty();
    }

    public Optional<Product> removeProduct(String id) {
        Optional<Product> deletedProduct = productRepository.findById(id);
        if (deletedProduct.isPresent()){
            productRepository.deleteById(id);
            return deletedProduct;
        }
        return Optional.empty();
    }
}
