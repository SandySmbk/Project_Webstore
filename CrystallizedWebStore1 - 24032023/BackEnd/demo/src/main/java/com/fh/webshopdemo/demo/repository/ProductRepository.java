package com.fh.webshopdemo.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fh.webshopdemo.demo.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{ ///Erweiterung der JPA-Schnittstelle, um Zugriff auf Product-Objekte in der Datenbank zu ermöglichen

    List<Product> findByType(String Type);  // Methode zum Suchen von Produkten nach typ

    List<Product> searchByName(String name);

}
