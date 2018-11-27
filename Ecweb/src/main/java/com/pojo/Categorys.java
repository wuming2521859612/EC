package com.pojo;

import java.util.Date;

public class Categorys {
    private int cateid;

    private int parentid;

    private String catename;

    private int catestatus;

    private int cateorder;

    private Date catetime;

    private Date catelasttime;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cateid=").append(cateid);
        sb.append(", parentid=").append(parentid);
        sb.append(", catename=").append(catename);
        sb.append(", catestatus=").append(catestatus);
        sb.append(", cateorder=").append(cateorder);
        sb.append(", catetime=").append(catetime);
        sb.append(", catelasttime=").append(catelasttime);
        sb.append("]");
        return sb.toString();
    }

}