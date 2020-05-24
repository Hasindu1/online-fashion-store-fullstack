package com.programmingfoundation.onlinefashionstore.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Products")
public class Product {
    @Id
    private String id;
    private String title;
    private String img;
    private double price;
    private String info;
    private String manufacturer;
    private int categoryId;

    public Product(){

    }

    public Product(String id ,String title, String img, double price, String info, String manufacturer, int categoryId) {
        this.id= id;
        this.title = title;
        this.img = img;
        this.price = price;
        this.info = info;
        this.manufacturer = manufacturer;
        this.categoryId = categoryId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", img='" + img + '\'' +
                ", price=" + price +
                ", info='" + info + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", categoryId=" + categoryId +
                '}';
    }
}
