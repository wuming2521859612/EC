<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath %>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/common.css" rel="stylesheet" type="text/css" />
<link href="fonts/iconfont.css"  rel="stylesheet" type="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link href="css/Orders.css" rel="stylesheet" type="text/css" />
<link href="css/purebox-metro.css" rel="stylesheet" id="skin">
<script src="js/jquery.min.1.8.2.js" type="text/javascript"></script>
<script src="js/jquery.reveal.js" type="text/javascript"></script>
<script src="js/jquery.SuperSlide.2.1.1.js" type="text/javascript"></script>
<script src="js/common_js.js" type="text/javascript"></script>
<script src="js/footer.js" type="text/javascript"></script>
<title>用户注册</title>
</head>

<body>
<div class="Reg_log_style">
 <div class="logo"><a href="#"><img src="images/logo.png" /></a></div>
  <div class="regist_style">
 <div class="left_img"><img src="images/bg_name_03.png" /></div>
 <div class="right_img"><img src="images/bg_name_05.png" /></div>
 <form id="myform" class="sign_area" autocomplete="off">
 <div class="title_name"><span>注册</span></div>
    <div class="regist_m_1">
     <div class="add_regist">
      <ul>
   <li class="frame_style"><label class="user_icon"></label><input name="" type="text"  id="user_text"/><i>用户名/邮箱</i></li>
   <li class="frame_style"><label class="password_icon"></label><input name="tbPassword" type="password"   id="tbPassword"  class="ywz_zhuce_kuangwenzi1 text_Password"/><i class="tx_password">6-16位，由字母（区分大小写）、数字、符号组成</i></li>    
    <div class="ywz_zhuce_xiaoxiaobao">
      <div class="ywz_zhuce_huixian" id="pwdLevel_1">弱 </div>
      <div class="ywz_zhuce_huixian" id="pwdLevel_2">中 </div>
      <div class="ywz_zhuce_huixian" id="pwdLevel_3">强 </div>
    </div>            
   <li class="frame_style"><label class="password_icon"></label><input name="" type="password"   id="confirm_pwd_text"/><i>确认密码</i></li>
   <li class="frame_style"><label class="Codes_icon"></label><input name="" type="text"   id="Codes_text"/><i>验证码</i><div class="Codes_region"></div></li>
  </ul>
    <div class="auto_login clearfix">
					 	<p class="clearfix">
                    	<a id="check_agreement" href="#" class="check_agreement">我已阅读相关规定</a>
                    	<input id="autoLoginCheck" type="hidden">
                    	<span id="agreement_tips" class="auto_tips" style=""></span>
                        </p>  
                        <a href="#" target="_blank" class="forget_pswd" tabindex="-1">《商城用户协议》</a>                     
                    </div>
  <div class="center clearfix" ><a class="btn_pink" id="btn_signin" href="javascript:void(0)">立即注册</a></div>
     </div>
    </div>
 </form>
 </div>
</div>
<div class="btmbg">
    <div class="btm">
        备案/许可证编号：蜀ICP备12009302号-1-www.dingguagua.com   Copyright © 2015-2018 商城网 All Rights Reserved. 复制必究 , Technical Support: Dgg Group <br>

    </div>    	
</div>
</body>
</html>