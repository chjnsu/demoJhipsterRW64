package com.vti.edu.railway.domain;

import com.vti.edu.railway.domain.enumeration.Make;
import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "make", nullable = false)
    private Make makeType;

    @NotNull
    @Column(name = "model", length = 255, nullable = false)
    private String model;

    @NotNull
    @Column(name = "year", nullable = false)
    private Long year;

    @NotNull
    @Column(name = "mileage", nullable = false)
    private Long mileage;

    @NotNull
    @Column(name = "price", nullable = false)
    private float price;

    @NotNull
    @Column(name = "color", length = 50, nullable = false)
    private String color;

    @NotNull
    @Column(name = "is_available", nullable = false)
    private boolean isAvailable;

    public Car() {}

    public Car(Long id, Make makeType, String model, Long year, Long mileage, float price, String color, boolean isAvailable) {
        this.id = id;
        this.makeType = makeType;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
        this.color = color;
        this.isAvailable = isAvailable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Make getMakeType() {
        return makeType;
    }

    public void setMakeType(Make makeType) {
        this.makeType = makeType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public Long getMileage() {
        return mileage;
    }

    public void setMileage(Long mileage) {
        this.mileage = mileage;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
