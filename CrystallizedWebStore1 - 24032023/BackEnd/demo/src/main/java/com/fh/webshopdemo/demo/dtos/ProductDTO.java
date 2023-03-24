package com.fh.webshopdemo.demo.dtos;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

//sind ein Entwurfsmuster, das dazu dient, Daten zwischen verschiedenen Schichten
// oder Komponenten einer Anwendung zu übertragen, ohne dass diese Schichten direkt miteinander interagieren müssen.
public class ProductDTO {
    private Long id;

    @NotBlank(message="name is a mandatory field")
    private String name;

    @NotBlank(message="description is a mandatory field")
    private String description;

    @NotBlank(message="image-URL is a mandatory field")
    private String imageUrl;

    @NotNull(message="price is a mandatory field")
    @PositiveOrZero(message="price has to be positive or zero")
    private Double price;

    @NotNull(message="quantity is a mandatory")
    @Min(value=0, message="quantity has to be zero or bigger")
    private Integer quantity;

    @NotBlank(message="type is a mandatory field")
    private String type;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
