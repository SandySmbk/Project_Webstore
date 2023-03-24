package com.fh.webshopdemo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fh.webshopdemo.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long>{ //Erweiterung der JPA-Schnittstelle, um Zugriff auf Product-Objekte in der Datenbank zu ermöglichen

}
