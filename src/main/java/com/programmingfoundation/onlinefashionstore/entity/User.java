package com.programmingfoundation.onlinefashionstore.entity;

import com.programmingfoundation.onlinefashionstore.dto.UserProductDTO;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document(collection = "Users")
public class User {
    @Id
    private String id;
    private String userName;
    private String password;
    private List<UserProductDTO> cart;
    private List<UserProductDTO> wishList;

    public User(String id, String userName, String password, List<UserProductDTO> cart, List<UserProductDTO> wishList) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.cart = cart;
        this.wishList = wishList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<UserProductDTO> getCart() {
        return cart;
    }

    public void setCart(List<UserProductDTO> cart) {
        this.cart = cart;
    }

    public List<UserProductDTO> getWishList() {
        return wishList;
    }

    public void setWishList(List<UserProductDTO> wishList) {
        this.wishList = wishList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", cart=" + cart +
                ", wishList=" + wishList +
                '}';
    }
}
