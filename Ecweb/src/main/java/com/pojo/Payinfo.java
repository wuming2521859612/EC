package com.pojo;

import java.util.Date;

public class Payinfo {
    int payid;

    String payorder;

    int payplatform;

    String platformnumber;

    String platformstatus;

    Date paytime;

    Date paylasttime;

    public int getPayid() {
        return payid;
    }

    public void setPayid(int payid) {
        this.payid = payid;
    }

    public String getPayorder() {
        return payorder;
    }

    public void setPayorder(String payorder) {
        this.payorder = payorder;
    }

    public int getPayplatform() {
        return payplatform;
    }

    public void setPayplatform(int payplatform) {
        this.payplatform = payplatform;
    }

    public String getPlatformnumber() {
        return platformnumber;
    }

    public void setPlatformnumber(String platformnumber) {
        this.platformnumber = platformnumber;
    }

    public String getPlatformstatus() {
        return platformstatus;
    }

    public void setPlatformstatus(String platformstatus) {
        this.platformstatus = platformstatus;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public Date getPaylasttime() {
        return paylasttime;
    }

    public void setPaylasttime(Date paylasttime) {
        this.paylasttime = paylasttime;
    }

}