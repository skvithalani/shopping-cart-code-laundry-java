package com.supercon.service;

import com.supercon.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    private static final List<Product> ALL_PRODUCTS = Arrays.asList(
            new Product(9.99, "PROD_01", "Please give this product a better name"),
            new Product(15.99, "DIS_10-PROD_02", "Aw come on! You can do better than that"),
            new Product(14.50, "DIS_15-PROD_03", "I am getting tired of this")
    );

    private List<Product> products;

    public ProductService() {
        this.products = ALL_PRODUCTS;
    }

    public ProductService(final List<Product> products) {
        this.products = products;
    }

    public List<String> getProductCodes() {
        return products.stream()
                .map(Product::getProductCode)
                .collect(Collectors.toList());
    }

    public Product getProduct(final String code) {
        for (final Product product : products) {
            if (product.getProductCode().equals(code)) {
                return product;
            }
        }
        return null;
    }
}
