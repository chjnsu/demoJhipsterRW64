package com.vti.edu.railway.domain;

import com.vti.edu.railway.domain.enumeration.Make;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

import static com.vti.edu.railway.domain.JobHistory_.language;

@Entity
@Table(name = "car")
public class Car {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private static Long id;


    @Enumerated(EnumType.STRING)
    @Column(name = "make")
    private Make make;

    @NotNull
    @Size(max = 255)
    @Column(name = "model", nullable = false)
    private String model;

    @NotNull
    @Column(name = "year")
    private Date year;

    @NotNull
    @Column(name = "mileage")
    private Long mileage;

    @NotNull
    @Size(min = 2, max = 10)
    @Column(name = "price")
    private Long price;

    @NotNull
    @Column(name = "color", nullable = false)
    private String color;

    @NotNull
    @Column(name = "is_available", nullable = false)
    private Boolean is_available;

    public Car(Long id, Make make, String model, Date year, Long mileage, Long price, String color, Boolean is_available) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
        this.color = color;
        this.is_available = is_available;
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
            ", is_available=" + is_available +
            '}';
    }

    public static Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Make getMake() {
        return this.make;
    }

    public Car Make(Make make) {
        this.setMake(make);
        return this;
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

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public Long getMileage() {
        return mileage;
    }

    public void setMileage(Long mileage) {
        this.mileage = mileage;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getIs_available() {
        return is_available;
    }

    public void setIs_available(Boolean is_available) {
        this.is_available = is_available;
    }
}
