package com.fh.webshopdemo.demo.controller;
import java.util.List;

import javax.validation.Valid;

import com.fh.webshopdemo.demo.dtos.ProductDTO;
import com.fh.webshopdemo.demo.model.Product;
import com.fh.webshopdemo.demo.service.ProductService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Verarbeitung von HTTP-Anfragen zu steuern und die Antwort zurück an den Client zu senden.

@RestController // Declares a RESTful controller class
@RequestMapping("/api/products") // All requests to "/products" will be forwarded to this controller
public class ProductController {

    // A private field for the ProductService
    private final ProductService productService;

    // Constructor that injects the ProductService
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
  
    // Handles HTTP GET requests to "/products" and returns a list of all products
    @GetMapping
    public List<Product> findAllProducts() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
public Product findProductById(@PathVariable Long id) {
    return productService.findById(id);
}

@PutMapping("/{id}")
public Product updateProduct(@PathVariable Long id, @Valid @RequestBody ProductDTO productDto) {
    Product product = mapProductDTOToProduct(productDto);
    product.setId(id);
    return productService.updateProduct(product);
}

@DeleteMapping("/{id}")
public void deleteProduct(@PathVariable Long id) {
    productService.deleteProduct(id);
}
@GetMapping("/search/{name}")
public List<Product> searchProducts(@PathVariable String name) {
    return productService.searchProducts(name);
}



    // Handles HTTP POST requests to "/products" and creates a new product
    @PostMapping 
    public Product createProduct(@Valid @RequestBody ProductDTO productDto){
        // Converts a ProductDTO object to a Product object
        Product product = mapProductDTOToProduct(productDto); 
        // Calls the ProductService to create the product
        return productService.createProduct(product);
    }
    



    // A helper method for converting a ProductDTO object to a Product object
    private Product mapProductDTOToProduct(ProductDTO productDto){
        Product product = new Product();
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        product.setImageUrl(productDto.getImageUrl());
        product.setPrice(productDto.getPrice());
        product.setQuantity(productDto.getQuantity());
        product.setType(productDto.getType());
        return product;
    }

}
