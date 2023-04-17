package com.vti.edu.railway.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "yone")
public class Yone implements Serializable {
    private static final long serialVersionUID = 1997;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_yone", length = 60)
    String name;

    @Column(name = "some_yone_value", length = 50)
    String someYoneValue;

    @Column(name = "some_int")
    int someint;

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

    public String getSomeYoneValue() {
        return someYoneValue;
    }

    public void setSomeYoneValue(String someYoneValue) {
        this.someYoneValue = someYoneValue;
    }

    public int getSomeint() {
        return someint;
    }

    public void setSomeint(int someint) {
        this.someint = someint;
    }
}
