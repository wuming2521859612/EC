package com.pojo;

import java.util.Date;

public class Cart {
    private int cartid;

    private int proid;

    private int cartquantity;

    private int cartchecked;

    private Date cartcreatetime;

    private Date cartlasttime;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cartid=").append(cartid);
        sb.append(", proid=").append(proid);
        sb.append(", cartquantity=").append(cartquantity);
        sb.append(", cartchecked=").append(cartchecked);
        sb.append(", cartcreatetime=").append(cartcreatetime);
        sb.append(", cartlasttime=").append(cartlasttime);
        sb.append("]");
        return sb.toString();
    }

}