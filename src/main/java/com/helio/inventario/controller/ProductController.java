package com.helio.inventario.controller;


import com.helio.inventario.dto.ProductRequestDTO;
import com.helio.inventario.model.Product;
import com.helio.inventario.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventario/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody @Valid ProductRequestDTO dto){
        Product newProduct = productService.createProduct(dto);

        return ResponseEntity.status(HttpStatus.CREATED).body(newProduct);
    }
    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();

        return ResponseEntity.ok(products);
    }
}
