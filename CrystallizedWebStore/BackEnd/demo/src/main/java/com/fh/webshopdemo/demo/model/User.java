package com.fh.webshopdemo.demo.model;

import javax.validation.constraints.NotBlank;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "user")
public class User {

    @Id// um das Primärschlüsselfeld anzugeben
    @GeneratedValue  // um anzugeben, dass der Wert dieses Feldes automatisch generiert werden soll
    @Column(name = "id") //um den Namen der Spalte in der Tabelle anzugeben
    private final Long id;
    @Column(name = "salutation")
    private String salutation;

    @NotBlank(message="first name is a mandatory field")
    @Column(name = "first_name")
    private String first_name;

    @NotBlank(message="last name is a mandatory field")
    @Column(name = "last_name")
    private String last_name;

    @NotBlank(message="email is a mandatory field")
    @Column(name = "email")
    private String email;

    @NotBlank(message="password is a mandatory field")
    @Column(name = "password")
    private String password;

    @NotBlank(message="street adress is a mandatory field")
    @Column(name = "street_adress")
    private String street_adress;

    @NotBlank(message="street number is a mandatory field")
    @Column(name = "street_number")
    private Long street_number;

    @NotBlank(message="city is a mandatory field")
    @Column(name = "city")
    private String city;

    @NotBlank(message="postal code is a mandatory field")
    @Column(name = "postal_code")
    private Long postal_code;

    @NotBlank(message="country is a mandatory field")
    @Column(name = "country")
    private String country;


    //Constructor
    public User(Long id, String salutation, String first_name, String last_name, String email, String password,
            String street_adress, Long street_number, String city, Long postal_code, String country) {
        this.id = id;
        this.salutation = salutation;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.street_adress = street_adress;
        this.street_number = street_number;
        this.city = city;
        this.postal_code = postal_code;
        this.country = country;
    }

    //default Constructor
    public User() {
        this.id = null;
        this.salutation = null;
        this.first_name = null;
        this.last_name = null;
        this.email = null;
        this.password = null;
        this.street_adress = null;
        this.street_number = null;
        this.city = null;
        this.postal_code = null;
        this.country = null;
    }
    
//getter und setter
public String getSalutation() {
    return salutation;
}

public void setSalutation(String salutation) {
    this.salutation = salutation;
}

public String getFirst_name() {
    return first_name;
}

public void setFirst_name(String first_name) {
    this.first_name = first_name;
}

public String getLast_name() {
    return last_name;
}

public void setLast_name(String last_name) {
    this.last_name = last_name;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

public String getStreet_adress() {
    return street_adress;
}

public void setStreet_adress(String street_adress) {
    this.street_adress = street_adress;
}

public Long getStreet_number() {
    return street_number;
}

public void setStreet_number(Long street_number) {
    this.street_number = street_number;
}

public String getCity() {
    return city;
}

public void setCity(String city) {
    this.city = city;
}

public Long getPostal_code() {
    return postal_code;
}

public void setPostal_code(Long postal_code) {
    this.postal_code = postal_code;
}

public String getCountry() {
    return country;
}

public void setCountry(String country) {
    this.country = country;
}

}
