package com.pojo;

import java.util.Date;

public class Userinfo {
    int userid;

    String username;

    String userpwd;

    String useremail;

    String userphone;

    String userquestion;

    String useranswer;

    int userrole;

    Date usercreatetime;

    Date userlasttime;

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
		return "Userinfo [userid=" + userid + ", username=" + username + ", userpwd=" + userpwd + ", useremail="
				+ useremail + ", userphone=" + userphone + ", userquestion=" + userquestion + ", useranswer="
				+ useranswer + ", userrole=" + userrole + ", usercreatetime=" + usercreatetime + ", userlasttime="
				+ userlasttime + "]";
	}   
}