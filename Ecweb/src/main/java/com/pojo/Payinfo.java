package com.pojo;

import java.util.Date;

public class Payinfo {
    private int payid;

    private String payorder;

    private int payplatform;

    private String platformnumber;

    private String platformstatus;

    private Date paytime;

    private Date paylasttime;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", payid=").append(payid);
        sb.append(", payorder=").append(payorder);
        sb.append(", payplatform=").append(payplatform);
        sb.append(", platformnumber=").append(platformnumber);
        sb.append(", platformstatus=").append(platformstatus);
        sb.append(", paytime=").append(paytime);
        sb.append(", paylasttime=").append(paylasttime);
        sb.append("]");
        return sb.toString();
    }

    
}