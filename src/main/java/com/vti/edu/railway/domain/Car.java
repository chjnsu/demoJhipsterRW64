package com.vti.edu.railway.domain;


import com.vti.edu.railway.domain.enumeration.Make;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;


@Entity
@Table(name = "car")
public class Car implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(name = "make")
    private Make make;
    @Column(name = "model", length = 255 )
    private String model ;
    @Column(name = "year")
    private Long year ;
    @Column(name = "mileage")
    private Long mileage ;
    @Column(name = "price")
    private BigDecimal price ;
    @Column(name = "color",length = 50 )
    private String color ;
    @Column(name = "is_available")
    private Boolean isAvailable ;

    public Car() {
    }

    public Car(Long id, Make make, String model, Long year, Long mileage, BigDecimal price, String color, Boolean is_available) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
        this.color = color;
        this.isAvailable = is_available;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Make getMake() {
        return make;
    }

    public void setMake(Make make) {
        this.make = make;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getIs_available() {
        return isAvailable;
    }

    public void setIs_available(Boolean is_available) {
        this.isAvailable = is_available;
    }

    @Override
    public String toString() {
        return "Car{" +
            "id=" + id +
            ", make=" + make +
            ", model='" + model + '\'' +
            ", year=" + year +
            ", mileage=" + mileage +
            ", price=" + price +
            ", color='" + color + '\'' +
            ", is_available=" + isAvailable +
            '}';
    }
}
