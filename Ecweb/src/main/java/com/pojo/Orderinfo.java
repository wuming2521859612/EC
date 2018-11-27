package com.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Orderinfo {
    private int orderid;

    private String payorder;

    private int userid;

    private int proid;

    private BigDecimal payment;

    private int paymenttype;

    private int paypostage;

    private int paystatus;

    private Date paymenttime;

    private Date paysendtime;

    private Date payendtime;

    private Date payclosetime;

    private Date paycreatetime;

    private Date paylasttime;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderid=").append(orderid);
        sb.append(", payorder=").append(payorder);
        sb.append(", userid=").append(userid);
        sb.append(", proid=").append(proid);
        sb.append(", payment=").append(payment);
        sb.append(", paymenttype=").append(paymenttype);
        sb.append(", paypostage=").append(paypostage);
        sb.append(", paystatus=").append(paystatus);
        sb.append(", paymenttime=").append(paymenttime);
        sb.append(", paysendtime=").append(paysendtime);
        sb.append(", payendtime=").append(payendtime);
        sb.append(", payclosetime=").append(payclosetime);
        sb.append(", paycreatetime=").append(paycreatetime);
        sb.append(", paylasttime=").append(paylasttime);
        sb.append("]");
        return sb.toString();
    }

}