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
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
<title>用户登录</title>
<script type="text/javascript">
	function tologin(){			
		var username =$("#user_text").val();
		var userpwd = $("#tbPassword").val();
		var isaotu="false";
		if(username=="" || userpwd==""){
			confirm("用户名或密码不能为空");
			return;
		}
		if($("#autologin").is(":checked")){
			autologin="true";
		}
		$.ajax({			
			Type:"post",
			url:"tologin?nameOremail="+username+"&userpwd="+userpwd+"&autologin="+autologin,
			cache:false,			
			success: function(data){				
				if(data=="no"){					
					confirm("用户名或密码错误");
				}else if(data=="ok"){					
					window.location.href="toHome";
				}					
			}
		});
	}																				
</script>
</head>
<body>
<div class="Reg_log_style">
 <div class="logo"><a href="#"><img src="images/logo.png" /></a></div>
 <div class="login_style">
 <div class="left_img"><img src="images/bg_name_03.png" /></div>
 <div class="right_img"><img src="images/bg_name_05.png" /></div>
    <form id="myform" class="sign_area" autocomplete="off">
    <div class="title_name"><span>登录</span></div>
    <div class="login_m_1">
     <div class="add_login">
  <ul>
   <li class="frame_style">
   <label class="user_icon"></label>
   <input  type="text"  id="user_text" required="required" placeholder="用户名/邮箱"/>
   </li>
   <li class="frame_style">
   <label class="password_icon"></label>
   <input  type="password"   id="tbPassword" required="required" placeholder="密码"/>
   </li>
  </ul>
 
  <div class="auto_login clearfix">
					 	<p class="clearfix">
                    	<input type="checkbox" id="autologin">自动登录</a>
                    	<input id="autoLoginCheck" type="hidden">                   	
                        </p>                       
                        <a href="#" target="_blank" class="forget_pswd" tabindex="-1">忘记密码？</a>
                    </div>
  <div class="center clearfix" ><a class="btn_pink" id="btn_signin" href="javascript:tologin()">立即登录</a></div>
  </div>
    </form>
  <!--其他登录方式-->
  <div class="Login_Method">
    <div class="title"><span>第三方登录方式</span></div>
    <div><a href="#"><img src="images/l_1.png" /></a><a href="#"><img src="images/l_2.png" /></a><a href="#"><img src="images/l_4.png" /></a>
      </div>
  </div>
 </div> 
 </div>
 </div>
 <div class="btmbg">
    <div class="btm">
        备案/许可证编号：蜀ICP备12009302号-1-www.dingguagua.com   Copyright © 2015-2018 商城网 All Rights Reserved. 复制必究 , Technical Support: Dgg Group <br>

    </div>    	
</div>
</body>
</html>
