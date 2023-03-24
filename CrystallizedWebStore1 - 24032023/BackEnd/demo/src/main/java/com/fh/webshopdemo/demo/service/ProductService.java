package com.fh.webshopdemo.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.fh.webshopdemo.demo.model.Product;
import com.fh.webshopdemo.demo.repository.ProductRepository;
//enthält Methoden, die die Geschäftslogik der Produktverwaltung implementieren

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository repository) {
        this.productRepository = repository;
    }
 
    public List<Product> findAll() {  //findAll() ruft alle Produkte aus dem Datenbank-Repository ab und gibt sie als Liste zurück
        return productRepository.findAll();
    }

    public Product save(Product product) { // speichert ein Produkt in der Datenbank und gibt das gespeicherte Produkt zurück
        return productRepository.save(product);
    }
    @PostMapping
    public Product createProduct (@RequestBody Product product) { //neues Produkt in der Datenbank hinzu und gibt erstellte Produkt zurück. Diese Methode wird durch eine POST-Anfrage vom Frontend aufgerufen und die Request-Body-Daten werden als Produkt-Objekt bereitgestellt.
        return productRepository.save(product);
    }

    public Product findById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public Product updateProduct(Product product) {
        Product existingProduct = productRepository.findById(product.getId())
                .orElseThrow(() -> new RuntimeException("Product not found"));

        existingProduct.setName(product.getName());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setImageUrl(product.getImageUrl());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setType(product.getType());

        return productRepository.save(existingProduct);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    public List<Product> searchProducts(String name) {
        return productRepository.searchByName(name);
    }

    

    
}