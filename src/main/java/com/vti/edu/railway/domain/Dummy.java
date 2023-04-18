package com.vti.edu.railway.domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "dummy")
public class Dummy implements Serializable {

    private static final long serialVersionUID = 20230414L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_dummy", length = 50)
    String name;

    @Column(name = "some_dum_value", length = 50)
    String someDumValue;

    @Column(name = "some_int")
    int someInt;

    @Column(name = "some_integer")
    Integer somInteger;

    @Column(name = "some_float")
    float someFloat;

    @Column(name = "aut_float")
    Float autFloat;

    public Dummy() {}

    public Dummy(Long id, String name, String someDumValue, int someInt, Integer somInteger, float someFloat, Float autFloat) {
        this.id = id;
        this.name = name;
        this.someDumValue = someDumValue;
        this.someInt = someInt;
        this.somInteger = somInteger;
        this.someFloat = someFloat;
        this.autFloat = autFloat;
    }

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

    public String getSomeDumValue() {
        return someDumValue;
    }

    public void setSomeDumValue(String someDumValue) {
        this.someDumValue = someDumValue;
    }

    public int getSomeInt() {
        return someInt;
    }

    public void setSomeInt(int someInt) {
        this.someInt = someInt;
    }

    public Integer getSomInteger() {
        return somInteger;
    }

    public void setSomInteger(Integer somInteger) {
        this.somInteger = somInteger;
    }

    public float getSomeFloat() {
        return someFloat;
    }

    public void setSomeFloat(float someFloat) {
        this.someFloat = someFloat;
    }

    public Float getAutFloat() {
        return autFloat;
    }

    public void setAutFloat(Float autFloat) {
        this.autFloat = autFloat;
    }

    @Override
    public String toString() {
        return (
            "Dummy{" +
            "id=" +
            id +
            ", name='" +
            name +
            '\'' +
            ", someDumValue='" +
            someDumValue +
            '\'' +
            ", someInt=" +
            someInt +
            ", somInteger=" +
            somInteger +
            ", someFloat=" +
            someFloat +
            ", autFloat=" +
            autFloat +
            '}'
        );
    }

    @Override
    public String toString() {
        return "Dummy{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", someDumValue='" + someDumValue + '\'' +
            ", someInt=" + someInt +
            ", somInteger=" + somInteger +
            ", someFloat=" + someFloat +
            ", autFloat=" + autFloat +
            '}';
    }
}
