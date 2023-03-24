package com.fh.webshopdemo.demo.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserDTO {
    private Long id;

    @NotBlank(message = "First name is a mandatory field")
    @Size(max = 50, message = "First name must be less than or equal to 50 characters")
    private String first_name;

    @NotBlank(message = "Last name is a mandatory field")
    @Size(max = 50, message = "Last name must be less than or equal to 50 characters")
    private String last_name;

    @NotBlank(message = "Email is a mandatory field")
    @Size(max = 50, message = "Email must be less than or equal to 50 characters")
    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "Invalid email format")
    private String email;

    @NotBlank(message = "Password is a mandatory field")
    @Size(max = 50, message = "Password must be less than or equal to 50 characters")
    private String password;

    @NotBlank(message = "Street address is a mandatory field")
    @Size(max = 50, message = "Street address must be less than or equal to 50 characters")
    private String street_adress;

    @NotNull(message = "Street number is a mandatory field")
    private Long street_number;

    @NotBlank(message = "City is a mandatory field")
    @Size(max = 50, message = "City must be less than or equal to 50 characters")
    private String city;

    @NotNull(message = "Postal code is a mandatory field")
    private Long postal_code;

    @NotBlank(message = "Country is a mandatory field")
    @Size(max = 50, message = "Country must be less than or equal to 50 characters")
    private String country;


    //getter und setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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