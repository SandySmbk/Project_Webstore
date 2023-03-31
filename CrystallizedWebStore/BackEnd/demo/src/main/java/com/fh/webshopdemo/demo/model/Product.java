package com.fh.webshopdemo.demo.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
//Das Model enthält die eigentlichen Daten, die von der Anwendung verarbeitet werden, 
//und es wird normalerweise verwendet, um die Daten aus der Datenbank abzurufen oder um sie in der Datenbank zu speichern.
import jakarta.persistence.ManyToOne;

@Entity(name="product")  // um diese Klasse als JPA-Entität mit dem Namen product zu kennzeichnen
public class Product {
    
    @Id  // um das Primärschlüsselfeld anzugeben
    @GeneratedValue  // um anzugeben, dass der Wert dieses Feldes automatisch generiert werden soll
    @Column(name="id")  // Annotation, um den Namen der Spalte in der Tabelle anzugeben
    private Long id;
    
    @NotBlank(message="name is a mandatory field") //Validation
    @Column(name="name")  
    private String name;
    
    @NotBlank(message="description is a mandatory field")
    @Column(name="description")  
    private String description;
    
    @NotBlank(message="image-URL is a mandatory field")
    @Column(name="image_url")  
    private String imageUrl;
    
    //@NotNull(message="price is a mandatory field")
    @PositiveOrZero(message="price has to be positive or zero")
    @Column(name="price") 
    private double price;
    
    //@NotNull(message="quantity is a mandatory")
    @Min(value=0, message="quantity has to be zero or bigger")
    @Column(name="quantity")  
    private int quantity;
    
    @NotBlank(message="type is a mandatory field")
    @Column(name="type")  
    private String type;
    
    @ManyToOne
    @JoinColumn(name="shopping_cart_id")
    private ShoppingCart shoppingCart;

    
    
    //default constructor
    public Product() {
        this.id = null;
        this.name = null;
        this.description = null;
        this.imageUrl = null;
        this.price = 0.0;
        this.quantity = 0;
        this.type = null;
    }
    

//constructor
    public Product(Long id, String name, String description, String imageUrl, double price, int quantity, String type) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.price = price;
        this.quantity = quantity;
        this.type = type;
    }

    
    // getter und setter
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setId(Long id) {
        this.id = id;
    }
    
    public ShoppingCart getShoppingCart() {
            return shoppingCart;
        }
    
    
        public void setShoppingCart(ShoppingCart shoppingCart) {
            this.shoppingCart = shoppingCart;
        }
    
}