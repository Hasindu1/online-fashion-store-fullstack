package com.programmingfoundation.onlinefashionstore.dto;

import java.util.List;

public class PaymentDTO {
    private String id;
    private String user_id;
    private double total;
    private String paymentType;
    private String address;
    private String date;
    private List<UserProductDTO> order;

    public PaymentDTO(String id, String user_id, double total, String paymentType, String address, String date, List<UserProductDTO> order) {
        this.id = id;
        this.user_id = user_id;
        this.total = total;
        this.paymentType = paymentType;
        this.address = address;
        this.date = date;
        this.order = order;
    }

//    public PaymentDTO(String id, String user_id, double total, String paymentType, String address, String date) {
//        this.id = id;
//        this.user_id = user_id;
//        this.total = total;
//        this.paymentType = paymentType;
//        this.address = address;
//        this.date = date;
//    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<UserProductDTO> getOrder() {
        return order;
    }

    public void setOrder(List<UserProductDTO> order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "PaymentDTO{" +
                "id='" + id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", total=" + total +
                ", paymentType='" + paymentType + '\'' +
                ", address='" + address + '\'' +
                ", date='" + date + '\'' +
                ", order=" + order +
                '}';
    }
}
