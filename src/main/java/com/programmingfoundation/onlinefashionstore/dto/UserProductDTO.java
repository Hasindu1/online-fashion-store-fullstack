package com.programmingfoundation.onlinefashionstore.dto;

public class UserProductDTO {
    private String id;
    private int count;
    private double total;

    public UserProductDTO(String id, int count, double total) {
        this.id = id;
        this.count = count;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return "CartProductDTO{" +
                "id='" + id + '\'' +
                ", count='" + count + '\'' +
                ", total=" + total +
                '}';
    }
}
