package com.pojo;

import java.util.Date;

public class Userinfo {
    private int userid;

    private String username;

    private String userpwd;

    private String useremail;

    private String userphone;

    private String userquestion;

    private String useranswer;

    private int userrole;

    private Date usercreatetime;

    private Date userlasttime;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public String getUserquestion() {
        return userquestion;
    }

    public void setUserquestion(String userquestion) {
        this.userquestion = userquestion;
    }

    public String getUseranswer() {
        return useranswer;
    }

    public void setUseranswer(String useranswer) {
        this.useranswer = useranswer;
    }

    public int getUserrole() {
        return userrole;
    }

    public void setUserrole(int userrole) {
        this.userrole = userrole;
    }

    public Date getUsercreatetime() {
        return usercreatetime;
    }

    public void setUsercreatetime(Date usercreatetime) {
        this.usercreatetime = usercreatetime;
    }

    public Date getUserlasttime() {
        return userlasttime;
    }

    public void setUserlasttime(Date userlasttime) {
        this.userlasttime = userlasttime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", userpwd=").append(userpwd);
        sb.append(", useremail=").append(useremail);
        sb.append(", userphone=").append(userphone);
        sb.append(", userquestion=").append(userquestion);
        sb.append(", useranswer=").append(useranswer);
        sb.append(", userrole=").append(userrole);
        sb.append(", usercreatetime=").append(usercreatetime);
        sb.append(", userlasttime=").append(userlasttime);
        sb.append("]");
        return sb.toString();
    }
}