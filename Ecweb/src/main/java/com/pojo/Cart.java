package com.pojo;

import java.util.Date;

public class Cart {
    int cartid;

    int proid;

    int cartquantity;

    int cartchecked;

    Date cartcreatetime;

    Date cartlasttime;

    public int getCartid() {
        return cartid;
    }

    public void setCartid(int cartid) {
        this.cartid = cartid;
    }

    public int getProid() {
        return proid;
    }

    public void setProid(int proid) {
        this.proid = proid;
    }

    public int getCartquantity() {
        return cartquantity;
    }

    public void setCartquantity(int cartquantity) {
        this.cartquantity = cartquantity;
    }

    public int getCartchecked() {
        return cartchecked;
    }

    public void setCartchecked(int cartchecked) {
        this.cartchecked = cartchecked;
    }

    public Date getCartcreatetime() {
        return cartcreatetime;
    }

    public void setCartcreatetime(Date cartcreatetime) {
        this.cartcreatetime = cartcreatetime;
    }

    public Date getCartlasttime() {
        return cartlasttime;
    }

    public void setCartlasttime(Date cartlasttime) {
        this.cartlasttime = cartlasttime;
    }

}