package com.vti.edu.railway.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
@Entity
@Table(name = "one_piece2")

public class OnePiece implements Serializable{

        private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "name", length = 50)
        private String name;
        @Column(name = "tra_ac_quy", length = 50)
        private String traAcQuy;
        @Column(name = "iq")
        private float iq;
        @Column(name = "gia")
        private BigDecimal gia;
        @Column(name = "tien_Float")
        private Float tienFloat;
        @Column(name = "skill", length = 50)
        private String skill;
        @Column(name = "thu_hang")
        private int thuHang;
        @Column(name = "thu_hang_Integer")
        private Integer thuHangIn;
        @Column(name = "dang_Boolean")
        private Boolean dangBoolean;
        @Column(name = "date")
        private Date date;
        @Enumerated(EnumType.ORDINAL)
        private Gender gender ;

    public OnePiece() {
    }

    public OnePiece(Long id, String name, String traAcQuy, float iq, BigDecimal gia, Float tienFloat, String skill, int thuHang, Integer thuHangIn, Boolean dangBoolean, Date date, Gender gender, OnePiece onePiece) {
        this.id = id;
        this.name = name;
        this.traAcQuy = traAcQuy;
        this.iq = iq;
        this.gia = gia;
        this.tienFloat = tienFloat;
        this.skill = skill;
        this.thuHang = thuHang;
        this.thuHangIn = thuHangIn;
        this.dangBoolean = dangBoolean;
        this.date = date;
        this.gender = gender;

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

    public String getTraAcQuy() {
        return traAcQuy;
    }

    public void setTraAcQuy(String traAcQuy) {
        this.traAcQuy = traAcQuy;
    }

    public float getIq() {
        return iq;
    }

    public void setIq(float iq) {
        this.iq = iq;
    }

    public BigDecimal getGia() {
        return gia;
    }

    public void setGia(BigDecimal gia) {
        this.gia = gia;
    }

    public Float getTienFloat() {
        return tienFloat;
    }

    public void setTienFloat(Float tienFloat) {
        this.tienFloat = tienFloat;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getThuHang() {
        return thuHang;
    }

    public void setThuHang(int thuHang) {
        this.thuHang = thuHang;
    }

    public Integer getThuHangIn() {
        return thuHangIn;
    }

    public void setThuHangIn(Integer thuHangIn) {
        this.thuHangIn = thuHangIn;
    }

    public Boolean getDangBoolean() {
        return dangBoolean;
    }

    public void setDangBoolean(Boolean dangBoolean) {
        this.dangBoolean = dangBoolean;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public OnePiece getOnePiece() {
        return onePiece;
    }

    public void setOnePiece(OnePiece onePiece) {
        this.onePiece = onePiece;
    }

    @Override
    public String toString() {
        return "OnePiece{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", traAcQuy='" + traAcQuy + '\'' +
            ", iq=" + iq +
            ", gia=" + gia +
            ", tienFloat=" + tienFloat +
            ", skill='" + skill + '\'' +
            ", thuHang=" + thuHang +
            ", thuHangIn=" + thuHangIn +
            ", dangBoolean=" + dangBoolean +
            ", date=" + date +
            ", gender=" + gender +

            '}';
    }
}
