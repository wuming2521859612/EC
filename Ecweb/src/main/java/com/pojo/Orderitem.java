package com.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Orderitem {
    private int itemid;

    private int userid;

    private String payorder;

    private int proid;

    private String proname;

    private String proimage;

    private BigDecimal payment;

    private int payquantity;

    private BigDecimal paytotalprice;

    private Date paycreatetime;

    private Date paylasttime;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", itemid=").append(itemid);
        sb.append(", userid=").append(userid);
        sb.append(", payorder=").append(payorder);
        sb.append(", proid=").append(proid);
        sb.append(", proname=").append(proname);
        sb.append(", proimage=").append(proimage);
        sb.append(", payment=").append(payment);
        sb.append(", payquantity=").append(payquantity);
        sb.append(", paytotalprice=").append(paytotalprice);
        sb.append(", paycreatetime=").append(paycreatetime);
        sb.append(", paylasttime=").append(paylasttime);
        sb.append("]");
        return sb.toString();
    }
}