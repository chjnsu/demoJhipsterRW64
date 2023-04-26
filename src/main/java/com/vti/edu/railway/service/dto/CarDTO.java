package com.vti.edu.railway.service.dto;

import com.vti.edu.railway.domain.enumeration.Make;

public class CarDTO {
    Make make;
    Long SLxe ;

    public CarDTO() {

    }

    public CarDTO(Make make, Long SLxe) {
        this.make = make;
        this.SLxe = SLxe;
    }

    public Make getMake() {
        return make;
    }

    public void setMake(Make make) {
        this.make = make;
    }

    public Long getSLxe() {
        return SLxe;
    }

    public void setSLxe(Long SLxe) {
        this.SLxe = SLxe;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
            "make=" + make +
            ", SLxe=" + SLxe +
            '}';
    }
}
