package com.pojo;

import java.util.Date;

public class Categorys {
    int cateid;

    int parentid;

    String catename;

    int catestatus;

    int cateorder;

    Date catetime;

    Date catelasttime;

    public int getCateid() {
        return cateid;
    }

    public void setCateid(int cateid) {
        this.cateid = cateid;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public String getCatename() {
        return catename;
    }

    public void setCatename(String catename) {
        this.catename = catename;
    }

    public int getCatestatus() {
        return catestatus;
    }

    public void setCatestatus(int catestatus) {
        this.catestatus = catestatus;
    }

    public int getCateorder() {
        return cateorder;
    }

    public void setCateorder(int cateorder) {
        this.cateorder = cateorder;
    }

    public Date getCatetime() {
        return catetime;
    }

    public void setCatetime(Date catetime) {
        this.catetime = catetime;
    }

    public Date getCatelasttime() {
        return catelasttime;
    }

    public void setCatelasttime(Date catelasttime) {
        this.catelasttime = catelasttime;
    }

}