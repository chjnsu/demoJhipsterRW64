package com.vti.edu.railway.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "product")
public class Product implements Serializable{
    private static final long serialVersionUID = 20230419L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ProductName", length = 50)
    String productName;

    @Column(name = "ProductPrice", length = 50)
    String productPrice;

    @Column(name = "ProductInfo", length = 50)
    String productInfo;

    @Column(name = "ProductDetail", length = 50)
    String productDetail;


    @Column(name = "RatingStar")
    int RatingStar;

    @Column(name = "ProductImageName", length = 50)
    String ProductImageName;

    @Column(name = "ManufacturerId")
    int manufacturerId;

    @Column(name = "CategoryId")
    int CategoryId;

    public Product(Long id, String productName, String productPrice, String productInfo, String productDetail, int ratingStar, String productImageName, int manufacturerId, int categoryId) {
        this.id = id;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productInfo = productInfo;
        this.productDetail = productDetail;
        RatingStar = ratingStar;
        ProductImageName = productImageName;
        this.manufacturerId = manufacturerId;
        CategoryId = categoryId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }

    public int getRatingStar() {
        return RatingStar;
    }

    public void setRatingStar(int ratingStar) {
        RatingStar = ratingStar;
    }

    public String getProductImageName() {
        return ProductImageName;
    }

    public void setProductImageName(String productImageName) {
        ProductImageName = productImageName;
    }

    public int getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(int manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Product{" +
            "id=" + id +
            ", productName='" + productName + '\'' +
            ", productPrice='" + productPrice + '\'' +
            ", productInfo='" + productInfo + '\'' +
            ", productDetail='" + productDetail + '\'' +
            ", RatingStar=" + RatingStar +
            ", ProductImageName='" + ProductImageName + '\'' +
            ", manufacturerId=" + manufacturerId +
            ", CategoryId=" + CategoryId +
            '}';
    }
}
