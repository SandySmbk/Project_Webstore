package com.fh.webshopdemo.demo.dtos;

import java.util.Set;

public class ShoppingCartDTO {

    private Long id;
    private UserDTO user;
    private Set<ProductDTO> products;
    
    //getter und setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public Set<ProductDTO> getProducts() {
        return products;
    }

    public void setProducts(Set<ProductDTO> products) {
        this.products = products;
    }
}