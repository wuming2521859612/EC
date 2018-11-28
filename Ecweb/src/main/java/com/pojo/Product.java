package com.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    int proid;

    int cateid;

    String proname;

    String prosubtitle;

    String proimage;

    String prodetail;

    BigDecimal proprice;

    int prostock;

    int prostatus;

    Date procreatetime;

    Date prolasttime;

    public int getProid() {
        return proid;
    }

    public void setProid(int proid) {
        this.proid = proid;
    }

    public int getCateid() {
        return cateid;
    }

    public void setCateid(int cateid) {
        this.cateid = cateid;
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname;
    }

    public String getProsubtitle() {
        return prosubtitle;
    }

    public void setProsubtitle(String prosubtitle) {
        this.prosubtitle = prosubtitle;
    }

    public String getProimage() {
        return proimage;
    }

    public void setProimage(String proimage) {
        this.proimage = proimage;
    }

    public String getProdetail() {
        return prodetail;
    }

    public void setProdetail(String prodetail) {
        this.prodetail = prodetail;
    }

    public BigDecimal getProprice() {
        return proprice;
    }

    public void setProprice(BigDecimal proprice) {
        this.proprice = proprice;
    }

    public int getProstock() {
        return prostock;
    }

    public void setProstock(int prostock) {
        this.prostock = prostock;
    }

    public int getProstatus() {
        return prostatus;
    }

    public void setProstatus(int prostatus) {
        this.prostatus = prostatus;
    }

    public Date getProcreatetime() {
        return procreatetime;
    }

    public void setProcreatetime(Date procreatetime) {
        this.procreatetime = procreatetime;
    }

    public Date getProlasttime() {
        return prolasttime;
    }

    public void setProlasttime(Date prolasttime) {
        this.prolasttime = prolasttime;
    }

}