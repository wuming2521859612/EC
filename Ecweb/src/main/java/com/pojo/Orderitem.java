package com.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Orderitem {
    int itemid;

    int userid;

    String payorder;

    int proid;

    String proname;

    String proimage;

    BigDecimal payment;

    int payquantity;

    BigDecimal paytotalprice;

    Date paycreatetime;

    Date paylasttime;

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getPayorder() {
        return payorder;
    }

    public void setPayorder(String payorder) {
        this.payorder = payorder;
    }

    public int getProid() {
        return proid;
    }

    public void setProid(int proid) {
        this.proid = proid;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public String getProimage() {
        return proimage;
    }

    public void setProimage(String proimage) {
        this.proimage = proimage;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    public int getPayquantity() {
        return payquantity;
    }

    public void setPayquantity(int payquantity) {
        this.payquantity = payquantity;
    }

    public BigDecimal getPaytotalprice() {
        return paytotalprice;
    }

    public void setPaytotalprice(BigDecimal paytotalprice) {
        this.paytotalprice = paytotalprice;
    }

    public Date getPaycreatetime() {
        return paycreatetime;
    }

    public void setPaycreatetime(Date paycreatetime) {
        this.paycreatetime = paycreatetime;
    }

    public Date getPaylasttime() {
        return paylasttime;
    }

    public void setPaylasttime(Date paylasttime) {
        this.paylasttime = paylasttime;
    }

}