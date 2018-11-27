package com.pojo;

import java.util.Date;

public class Address {
    private int addid;

    private int userid;

    private String addname;

    private String addphone;

    private String addmobile;

    private String addprovince;

    private String addcity;

    private String adddistict;

    private String addaddress;

    private String addzip;

    private Date addcreatetime;

    private Date addlasttime;

    public int getAddid() {
        return addid;
    }

    public void setAddid(int addid) {
        this.addid = addid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getAddname() {
        return addname;
    }

    public void setAddname(String addname) {
        this.addname = addname;
    }

    public String getAddphone() {
        return addphone;
    }

    public void setAddphone(String addphone) {
        this.addphone = addphone;
    }

    public String getAddmobile() {
        return addmobile;
    }

    public void setAddmobile(String addmobile) {
        this.addmobile = addmobile;
    }

    public String getAddprovince() {
        return addprovince;
    }

    public void setAddprovince(String addprovince) {
        this.addprovince = addprovince;
    }

    public String getAddcity() {
        return addcity;
    }

    public void setAddcity(String addcity) {
        this.addcity = addcity;
    }

    public String getAdddistict() {
        return adddistict;
    }

    public void setAdddistict(String adddistict) {
        this.adddistict = adddistict;
    }

    public String getAddaddress() {
        return addaddress;
    }

    public void setAddaddress(String addaddress) {
        this.addaddress = addaddress;
    }

    public String getAddzip() {
        return addzip;
    }

    public void setAddzip(String addzip) {
        this.addzip = addzip;
    }

    public Date getAddcreatetime() {
        return addcreatetime;
    }

    public void setAddcreatetime(Date addcreatetime) {
        this.addcreatetime = addcreatetime;
    }

    public Date getAddlasttime() {
        return addlasttime;
    }

    public void setAddlasttime(Date addlasttime) {
        this.addlasttime = addlasttime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", addid=").append(addid);
        sb.append(", userid=").append(userid);
        sb.append(", addname=").append(addname);
        sb.append(", addphone=").append(addphone);
        sb.append(", addmobile=").append(addmobile);
        sb.append(", addprovince=").append(addprovince);
        sb.append(", addcity=").append(addcity);
        sb.append(", adddistict=").append(adddistict);
        sb.append(", addaddress=").append(addaddress);
        sb.append(", addzip=").append(addzip);
        sb.append(", addcreatetime=").append(addcreatetime);
        sb.append(", addlasttime=").append(addlasttime);
        sb.append("]");
        return sb.toString();
    }

}