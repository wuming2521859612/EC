package com.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Orderinfo {
    int orderid;

    String payorder;

    int userid;

    int proid;

    BigDecimal payment;

    int paymenttype;

    int paypostage;

    int paystatus;

    Date paymenttime;

    Date paysendtime;

    Date payendtime;

    Date payclosetime;

    Date paycreatetime;

    Date paylasttime;

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getPayorder() {
        return payorder;
    }

    public void setPayorder(String payorder) {
        this.payorder = payorder;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getProid() {
        return proid;
    }

    public void setProid(int proid) {
        this.proid = proid;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    public int getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(int paymenttype) {
        this.paymenttype = paymenttype;
    }

    public int getPaypostage() {
        return paypostage;
    }

    public void setPaypostage(int paypostage) {
        this.paypostage = paypostage;
    }

    public int getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(int paystatus) {
        this.paystatus = paystatus;
    }

    public Date getPaymenttime() {
        return paymenttime;
    }

    public void setPaymenttime(Date paymenttime) {
        this.paymenttime = paymenttime;
    }

    public Date getPaysendtime() {
        return paysendtime;
    }

    public void setPaysendtime(Date paysendtime) {
        this.paysendtime = paysendtime;
    }

    public Date getPayendtime() {
        return payendtime;
    }

    public void setPayendtime(Date payendtime) {
        this.payendtime = payendtime;
    }

    public Date getPayclosetime() {
        return payclosetime;
    }

    public void setPayclosetime(Date payclosetime) {
        this.payclosetime = payclosetime;
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