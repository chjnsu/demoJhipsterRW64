package com.vti.edu.railway.domain;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="Customer")
public class Customer implements Serializable {
    private static final long serialVersionUID = 20230414L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "CustomerName",length = 50)
    private String CustomerName;
    @Column(name = "ContactName",length = 50)
    private  String ContactName;
    @Column(name = "Address", length = 50)
    private String Address;
    @Column(name = "City", length = 50)
    private String City;
    @Column(name = "PostalCode", length = 50)
    private String PostalCode;
    @Column(name = "Country", length = 50)
    private String Country;

    public Customer() {
    }

    public Customer(Long id, String customerName, String contactName, String address, String city, String postalCode, String country) {
        this.id = id;
        CustomerName = customerName;
        ContactName = contactName;
        Address = address;
        City = city;
        PostalCode = postalCode;
        Country = country;
    }

    public Long getId() {
        return id;
    }

    public Customer setId(Long id) {
        this.id = id;
        return this;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public Customer setCustomerName(String customerName) {
        CustomerName = customerName;
        return this;
    }

    public String getContactName() {
        return ContactName;
    }

    public Customer setContactName(String contactName) {
        ContactName = contactName;
        return this;
    }

    public String getAddress() {
        return Address;
    }

    public Customer setAddress(String address) {
        Address = address;
        return this;
    }

    public String getCity() {
        return City;
    }

    public Customer setCity(String city) {
        City = city;
        return this;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public Customer setPostalCode(String postalCode) {
        PostalCode = postalCode;
        return this;
    }

    public String getCountry() {
        return Country;
    }

    public Customer setCountry(String country) {
        Country = country;
        return this;
    }

    @Override
    public String toString() {
        return "Customer{" +
            "id=" + id +
            ", CustomerName='" + CustomerName + '\'' +
            ", ContactName='" + ContactName + '\'' +
            ", Address='" + Address + '\'' +
            ", City='" + City + '\'' +
            ", PostalCode='" + PostalCode + '\'' +
            ", Country='" + Country + '\'' +
            '}';
    }
}
