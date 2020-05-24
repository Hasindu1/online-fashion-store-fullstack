package com.programmingfoundation.onlinefashionstore.dto;

public class ProductDTO {
    private String id;
    private String title;
    private String img;
    private double price;
    private String info;
    private String manufacturer;
    private int categoryId;
    private boolean inCart;
    private boolean inWishList;
    private int count;
    private double total;

    public ProductDTO() {

    }

    public ProductDTO(String id, String title, String img, double price, String info, String manufacturer, int categoryId, boolean inCart, boolean inWishList, int count, double total) {
        this.id = id;
        this.title = title;
        this.img = img;
        this.price = price;
        this.info = info;
        this.manufacturer = manufacturer;
        this.categoryId = categoryId;
        this.inCart = inCart;
        this.inWishList = inWishList;
        this.count = count;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public boolean isInCart() {
        return inCart;
    }

    public void setInCart(boolean inCart) {
        this.inCart = inCart;
    }

    public boolean isInWishList() {
        return inWishList;
    }

    public void setInWishList(boolean inWishList) {
        this.inWishList = inWishList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", img='" + img + '\'' +
                ", price=" + price +
                ", info='" + info + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", categoryId=" + categoryId +
                ", inCart=" + inCart +
                ", inWishList=" + inWishList +
                ", count=" + count +
                ", total=" + total +
                '}';
    }
}
