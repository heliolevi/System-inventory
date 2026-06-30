package com.helio.inventario.service;


import com.helio.inventario.dto.ProductRequestDTO;
import com.helio.inventario.model.Product;
import com.helio.inventario.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    //TODO: REGRAS DE NEGÓCIO

    public Product createProduct(ProductRequestDTO dto) {
        if (productRepository.findByCode(dto.code()).isPresent()) {
            throw new RuntimeException("Já existe um produto cadastrado com o código: "+ dto.code());
        }
        Product product = new Product();
        product.setCode(dto.code());
        product.setName(dto.name());
        product.setPrice(dto.price());
        product.setQuantityInStock(dto.quantityInStock());

        return productRepository.save(product);
    }
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
