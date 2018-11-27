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
<link href="css/show.css" rel="stylesheet" type="text/css" />
<link href="css/purebox-metro.css" rel="stylesheet" id="skin">
<script src="js/jquery.min.1.8.2.js" type="text/javascript"></script>
<script src="js/jquery.SuperSlide.2.1.1.js" type="text/javascript"></script>
<script src="js/jquery.reveal.js" type="text/javascript"></script>
<script src="js/common_js.js" type="text/javascript"></script>
<script src="js/footer.js" type="text/javascript"></script>
<title>购物车</title>
</head>
<script type="text/javascript">
$(document).ready(function () {
   //全选
   $("#CheckedAll").click(function () {
	   if (this.checked) {                 //如果当前点击的多选框被选中
		   $('input[type=checkbox][name=checkitems]').attr("checked", true);
	   } else {
		   $('input[type=checkbox][name=checkitems]').attr("checked", false);
	   }
   });
   $('input[type=checkbox][name=checkitems]').click(function () {
	   var flag = true;
	   $('input[type=checkbox][name=checkitems]').each(function () {
		   if (!this.checked) {
			   flag = false;
		   }
	   });

	   if (flag) {
		   $('#CheckedAll').attr('checked', true);
	   } else {
		   $('#CheckedAll').attr('checked', false);
	   }
   });
   //输出值
   $("#send").click(function () {
	      if($("input[type='checkbox'][name='checkitems']:checked").attr("checked")){
	   var str = "你是否要删除选中的商品：\r\n";
	   $('input[type=checkbox][name=checkitems]:checked').each(function () {
		   str += $(this).val() + "\r\n";
	   })
	   alert(str);
		  }
		  else{
			   var str = "你未选中任何商品，请选择后在操作！"; 
			   alert(str);
       }
	   	    
   });
})
</script>
<body>
<!--顶部样式-->
 <div id="header_top">
  <div id="top">
    <div class="Inside_pages">
      <div class="Collection">下午好，欢迎光临商城<em></em><a href="#">收藏我们</a></div>
	<div class="hd_top_manu clearfix">
	  <ul class="clearfix">
	   <li class="hd_menu_tit zhuce" data-addclass="hd_menu_hover">欢迎光临本店！<a href="#" class="red">[请登录]</a> 新用户<a href="#" class="red">[免费注册]</a></li>
	   <li class="hd_menu_tit" data-addclass="hd_menu_hover"><a href="#">我的订单</a></li> 
	   <li class="hd_menu_tit" data-addclass="hd_menu_hover"> <a href="#">购物车</a> </li>
	   <li class="hd_menu_tit" data-addclass="hd_menu_hover"><a href="#">联系我们</a></li>
	   <li class="hd_menu_tit list_name" data-addclass="hd_menu_hover"><a href="#" class="hd_menu">客户服务</a>
	    <div class="hd_menu_list">
		   <ul>
		    <li><a href="#">常见问题</a></li>
			<li><a href="#">在线退换货</a></li>
		    <li><a href="#">在线投诉</a></li>
			<li><a href="#">配送范围</a></li>
		   </ul>
		</div>	   
	   </li>
       <li class="hd_menu_tit phone_c" data-addclass="hd_menu_hover"><a href="#" class="hd_menu "><em class="iconfont icon-shouji"></em>手机版</a>
	    <div class="hd_menu_list erweima">
		   <ul>
            <img src="images/erweima.jpg"  width="100px" height="100"/>
		   </ul>
		</div>	   
	   </li>
	  </ul>
	</div>
    </div>
  </div>
  <!--顶部样式1-->
  <div id="header"  class="header page_style">
  <div class="logo"><a href="index.html"><img src="images/logo.png" /></a></div>
  <!--结束图层-->
  <div class="Search">
    <p><input name="" type="text"  class="text"/><input name="" type="submit" value="搜 索"  class="Search_btn"/></p>
	<p class="Words"><a href="#">苹果</a><a href="#">香蕉</a><a href="#">菠萝</a><a href="#">西红柿</a><a href="#">橙子</a><a href="#">苹果</a></p>
</div>
 <!--购物车样式-->
 <div class="hd_Shopping_list" id="Shopping_list">
   <div class="s_cart"><em class="iconfont icon-cart2"></em><a href="#">我的购物车</a> <i class="ci-right">&gt;</i><i class="ci-count" id="shopping-amount">0</i></div>
   <div class="dorpdown-layer">
    <div class="spacer"></div>
	 <!--<div class="prompt"></div><div class="nogoods"><b></b>购物车中还没有商品，赶紧选购吧！</div>-->
	 <ul class="p_s_list">	   
		<li>
		    <div class="img"><img src="products/p_7.jpg"></div>
		    <div class="content"><p><a href="#">产品名称</a></p><p>颜色分类:紫花8255尺码:XL</p></div>
			<div class="Operations">
			<p class="Price">￥55.00</p>
			<p><a href="#">删除</a></p></div>
		  </li>
		</ul>		
	 <div class="Shopping_style">
	 <div class="p-total">共<b>1</b>件商品　共计<strong>￥ 515.00</strong></div>
	  <a href="Shop_cart.html" title="去购物车结算" id="btn-payforgoods" class="Shopping">去购物车结算</a>
	 </div>	 
   </div>
 </div>
</div>
<!--菜单导航样式-->
<div id="Menu" class="clearfix">
<div class="index_style clearfix">
  <div id="allSortOuterbox" class="display">
    <div class="t_menu_img"></div>
    <div class="Category"><a href="#"><em></em>所有产品分类</a></div>
    <div class="hd_allsort_out_box_new">
	 <!--左侧栏目开始-->
	 <ul class="Menu_list">	
	    <li class="name">
		<div class="Menu_name"><a href="product_list.html" >面部护理</a> <span>&lt;</span></div>
		<div class="link_name">
		  <p><a href="product_Detailed.html">茅台</a>  <a href="#">五粮液</a>  <a href="#">郎酒</a>  <a  href="#">剑南春</a></p>
		</div>
		<div class="menv_Detail">
		 <div class="cat_pannel clearfix">
		   <div class="hd_sort_list">
		    <dl class="clearfix" data-tpc="1">
			 <dt><a href="#">面膜<i>></i></a></dt>
			 <dd><a href="#">撕拉面膜</a><a href="#">面膜贴</a><a href="#">免洗面膜</a><a href="#">水洗面膜</a></dd> 
			</dl>
			 <dl class="clearfix" data-tpc="2">
			 <dt><a href="#">洁面<i>></i></a></dt>
			 <dd><a href="#">洁面摩丝</a><a href="#">洁面乳 </a><a href="#">洁面啫哩/胶</a><a href="#">面部去角质/磨砂</a><a href="#">洁面膏/霜</a><a href="#">洁肤皂</a></dd> 
			</dl>
			 <dl class="clearfix" data-tpc="3">
			 <dt><a href="#">化妆水<i>></i></a></dt>
			 <dd><a href="#"> 喷雾</a><a href="#"> 精华水</a><a href="#"> 柔肤水</a><a href="#">爽肤水</a><a href="#">收敛水/紧肤水</a></dd> 
			</dl>
			 <dl class="clearfix" data-tpc="4">
			 <dt><a href="#">眼部护理<i>></i></a></dt>
			 <dd><a href="#"> 眼膜</a><a href="#"> 眼部凝胶</a><a href="#">眼部精华</a><a href="#">眼霜</a></dd> 
			</dl>
             <dl class="clearfix" data-tpc="4">
			 <dt><a href="#">眼部护理<i>></i></a></dt>
			 <dd><a href="#"> 眼膜</a><a href="#"> 眼部凝胶</a><a href="#">眼部精华</a><a href="#">眼霜</a></dd> 
			</dl>
             <dl class="clearfix" data-tpc="4">
			 <dt><a href="#">防晒<i>></i></a></dt>
			 <dd><a href="#"> 眼膜</a><a href="#"> 眼部凝胶</a><a href="#">眼部精华</a><a href="#">眼霜</a></dd> 
			</dl>
             <dl class="clearfix" data-tpc="4">
			 <dt><a href="#">唇部护理<i>></i></a></dt>
			 <dd><a href="#"> 眼膜</a><a href="#"> 眼部凝胶</a><a href="#">眼部精华</a><a href="#">眼霜</a></dd> 
			</dl> <dl class="clearfix" data-tpc="4">
			 <dt><a href="#">乳液/面霜<i>></i></a></dt>
			 <dd><a href="#"> 乳液</a><a href="#"> 面霜</a><a href="#">按摩霜</a><a href="#">面部啫喱</a><a href="#">凝露/凝胶</a></dd> 
			</dl>
		   </div><div class="Brands">
		  	   
		  </div>
		  </div>
		  <!--品牌-->		  
		</div>		 
		</li>
		<li class="name">
		<div class="Menu_name"><a href="#" >身体护理</a><span>&lt;</span></div>
		<div class="link_name">
		 <a href="product_Detailed.html"> 面霜</a><a href="#">眼霜</a><a href="#"> 面膜</a><a href="#">护肤套装</a>

		</div>
		<div class="menv_Detail">
		 <div class="cat_pannel clearfix">		   
		  </div>
		</div>		
		</li>
		<li class="name">
		<div class="Menu_name"><a href="#" >香水彩妆</a><span>&lt;</span></div>
		<div class="link_name">
		<a href="#">卸妆 </a><a href="#">防晒</a><a href="#">BB</a>
        <a href="#">女士香水</a>
		</div>
		<div class="menv_Detail">
		 <div class="cat_pannel clearfix">		   
		  </div>
		</div>	
		</li>
		<li class="name">
		<div class="Menu_name"><a href="#" >洗发护发</a><span>&lt;</span></div>
		<div class="link_name">
		<a href="#">洗发</a><a href="#">护发</a><a href="#">沐浴</a><a href="#">润肤乳</a>
		</div>
		<div class="menv_Detail">
		 <div class="cat_pannel clearfix">		    
		  </div>
		</div>	
		</li>
		<li class="name">
		<div class="Menu_name"><a href="#" >女性护理</a><span>&lt;</span></div>
		<div class="link_name">
		<a href="#">洁面</a><a href="#">坚果炒货</a><a href="#">乳液</a>
        <a href="#"> 面霜</a>
		</div>
		<div class="menv_Detail">
		 <div class="cat_pannel clearfix">		    
		  </div>
		</div>	
		</li>
        <li class="name">
		<div class="Menu_name"><a href="#" >男性护理</a><span>&lt;</span></div>
		<div class="link_name">
		<a href="#">洁面</a><a href="#">坚果炒货</a><a href="#">乳液</a>
        <a href="#"> 面霜</a>
		</div>
		<div class="menv_Detail">
		 <div class="cat_pannel clearfix">		    
		  </div>
		</div>	
		</li>
		<li class="name">
		<div class="Menu_name"><a href="#" >推荐品牌</a><span>&lt;</span></div>
		<div class="link_name">
		<a href="#">欧莱雅</a><a href="#"> 菲诗小铺</a><a href="#"> 雅诗兰黛</a>
		</div>
		<div class="menv_Detail">
		 <div class="cat_pannel clearfix">		    
		  </div>
		</div>	
		</li>
        <li class="name">
		<div class="Menu_name"><a href="#" >推荐品牌</a><span>&lt;</span></div>
		<div class="link_name">
		<a href="#">欧莱雅</a><a href="#"> 菲诗小铺</a><a href="#"> 雅诗兰黛</a>
		</div>
		<div class="menv_Detail">
		 <div class="cat_pannel clearfix">		    
		  </div>
		</div>	
		</li>		
	</ul>	
	</div>		
	</div>
	<script>$("#allSortOuterbox").slide({ titCell:".Menu_list li",mainCell:".menv_Detail",	});</script>
	<!--菜单栏-->
	<div class="Navigation" id="Navigation">
		 <ul class="Navigation_name">
			<li><a href="#">首页</a></li>
				<li><a href="product_list.html">产品列表</a></li>
			<li><a href="Limit_buy.html">限时特卖</a><em class="hot_icon"></em></li>
			<li><a href="#">联系我们</a></li>
			<li><a href="#">鲜盟人才</a></li>
			<li><a href="#">鲜盟金融</a></li>
			<li><a href="#">鲜盟投资</a></li>
			<li><a href="#">鲜盟股票</a></li>
		 </ul>			 
		</div>
	<script>$("#Navigation").slide({titCell:".Navigation_name li"});</script>
     <!-- <a href="#" class="link_bg"><img src="images/link_bg_03.png" /></a>-->		
  </div>
</div>
</div>
<!--购物车样式-->
<div class="Inside_pages clearfix">
  <div class="shop_carts">
   <div class="Process"><img src="images/Process_img_01.png" /></div>
 <div class="Shopping_list">
  <div class="title_name">
    <ul>
	<li class="checkbox"></li>
	<li class="name">商品名称</li>
	<li class="scj">市场价</li>
	<li class="bdj">本店价</li>
	<li class="sl">购买数量</li>
	<li class="xj">小计</li>
	<LI class="cz">操作</LI>
  </ul>
 </div>
  <div class="shopping">
  <form  method="post" action="">
 <table class="table_list">
   <tr class="tr">
   <td class="checkbox"><input name="checkitems" type="checkbox" value="金龙鱼 东北大米 蟹稻共生 盘锦大米5KG" /></td>
    <td class="name">
	  <div class="img"><a href="#"><img src="products/p_1.jpg" /></a></div>
	  <div class="p_name"><a href="#">金龙鱼 东北大米 蟹稻共生 盘锦大米5KG</a></div>
	</td>
	<td class="scj sp"><span id="Original_Price_1">￥39.50</span></td>
	<td class="bgj sp" ><span id="price_item_1">￥32.40</span></td>
	<td class="sl">
	    <div class="Numbers">
		  <a onClick="setAmount.reduce('#qty_item_1')" href="javascript:void(0)" class="jian">-</a>
          <input type="text" name="qty_item_" value="1" id="qty_item_1" onkeyup="setAmount.modify('#qty_item_1')" class="number_text">
		  <a onclick="setAmount.add('#qty_item_1')" href="javascript:void(0)" class="jia">+</a>
		 </div>
	</td>
	<td class="xj" ><span id="total_item_1"></span><input type="hidden" name="total_price" id="total_price" value=""></td>
	<td class="cz">
	 <p><a href="#">删除</a><P>
	 <p><a href="#">收藏该商品</a></p>
	</td>
   </tr>
       <tr class="tr on">
       <td class="checkbox"><input name="checkitems" type="checkbox" value="金龙鱼 东北大米 蟹稻共生 盘锦大米5KG" /></td>
      <td class="name">
        <div class="img"><a href="#"><img src="products/p_2.jpg" /></a></div>
        <div class="p_name"><a href="#">金龙鱼 东北大米 蟹稻共生 盘锦大米5KG</a></div>
      </td>
      <td class="scj sp">￥39.50</td>
      <td class="bgj sp" id="price_item_2">￥32.40</td>
      <td class="sl">
          <div class="Numbers">
            <a onClick="setAmount.reduce('#qty_item_')" href="javascript:void(0)" class="jian">-</a>
            <input type="text" name="qty_item_" value="1" id="qty_item_" onkeyup="setAmount.modify('#qty_item_')" class="number_text">
            <a onclick="setAmount.add('#qty_item_')" href="javascript:void(0)" class="jia">+</a>
           </div>
      </td>
      <td class="xj" ><span id="total_item_2"></span><input type="hidden" name="total_price" id="total_price" value=""></td>
      <td class="cz">
       <p><a href="#">删除</a><P>
       <p><a href="#">收藏该商品</a></p>
      </td>
     </tr>
 </table>
 <div class="sp_Operation clearfix">
  <div class="select-all">
  <div class="cart-checkbox"><input type="checkbox"   id="CheckedAll" name="toggle-checkboxes" class="jdcheckbox" clstag="clickcart">全选</div>
  <div class="operation"><a href="javascript:void(0);" id="send">删除选中的商品</a></div> 
    </div>    
	 <!--结算-->
	<div class="toolbar_right">
    <ul class="Price_Info">
    <li class="p_Total"><label class="text">商品总价：</label><span class="price sumPrice" id="Total_price"></span></li>
	<li class="Discount"><label class="text">以&nbsp;&nbsp;节&nbsp;&nbsp;省：</label><span class="price" id="Preferential_price"></span></li>
    <li class="integral">本次购物可获得<b id="total_points"></b>积分</li>
    </ul>
	<div class="btn"><a class="cartsubmit" href="Orders_confirm.html"></a><a class="continueFind" href="product_list.html"></a></div>
  </div>
  </div>
   </form>
 </div>
 </div>
 <!--推荐产品样式-->
 <div class="recommend_shop">
   <div class="title_name">推荐购买</div>
   <div class="recommend_list">
    <div class="hd">
     <a class="prev" href="javascript:void(0)">&gt;</a>
     <a class="next" href="javascript:void(0)">&lt;</a>
    </div>
    <div class="bd">
      <ul>
       <li class="recommend_info">
       <a href="#" class="buy_btn">立即购买</a>
       <a href="#" class="img"><img src="products/p_45.jpg" width="160px" height="160px"/></a>
       <a href="#" class="name">光明莫斯利安酸牛奶 巴氏杀菌常温200g*12盒钻石装</a>
       <h4><span class="Price"><i>RNB</i>123.00</span></h4>
       </li>
       <li class="recommend_info">
       <a href="#" class="buy_btn">立即购买</a>
       <a href="#" class="img"><img src="products/p_5.jpg" width="160px" height="160px"/></a>
       <a href="#" class="name">光明莫斯利安酸牛奶 巴氏杀菌常温200g*12盒钻石装</a>
       <h4><span class="Price"><i>RNB</i>123.00</span></h4>
       </li>
       <li class="recommend_info">
       <a href="#" class="buy_btn">立即购买</a>
       <a href="#" class="img"><img src="products/p_36.jpg" width="160px" height="160px"/></a>
       <a href="#" class="name">光明莫斯利安酸牛奶 巴氏杀菌常温200g*12盒钻石装</a>
       <h4><span class="Price"><i>RNB</i>123.00</span></h4>
       </li>
       <li class="recommend_info">
       <a href="#" class="buy_btn">立即购买</a>
       <a href="#" class="img"><img src="products/p_25.jpg" width="160px" height="160px"/></a>
       <a href="#" class="name">光明莫斯利安酸牛奶 巴氏杀菌常温200g*12盒钻石装</a>
       <h4><span class="Price"><i>RNB</i>123.00</span></h4>
       </li>
       
       <li class="recommend_info">
       <a href="#" class="buy_btn">立即购买</a>
       <a href="#" class="img"><img src="products/p_15.jpg" width="160px" height="160px"/></a>
       <a href="#" class="name">光明莫斯利安酸牛奶 巴氏杀菌常温200g*12盒钻石装</a>
       <h4><span class="Price"><i>RNB</i>123.00</span></h4>
       </li>
       <li class="recommend_info">
       <a href="#" class="buy_btn">立即购买</a>
       <a href="#" class="img"><img src="products/p_37.jpg" width="160px" height="160px"/></a>
       <a href="#" class="name">光明莫斯利安酸牛奶 巴氏杀菌常温200g*12盒钻石装</a>
       <h4><span class="Price"><i>RNB</i>123.00</span></h4>
       </li>
      </ul>  
    </div>
   </div>
   <script>jQuery(".recommend_list").slide({titCell:".hd ul",mainCell:".bd ul",autoPage:true,effect:"left",autoPlay:true,vis:6});</script>
 </div>
 </div>
</div>
 <div class="slogen">
  <div class="index_style">
    <ul class="wrap">
	 <li>
	  <a href="#"><img src="images/slogen_34.png" data-bd-imgshare-binded="1"></a>
	  <b>安全保证</b>
	  <span>多重保障机制 认证商城</span>
	 </li>
	 <li><a href="#"><img src="images/slogen_28.png" data-bd-imgshare-binded="2"></a>
	  <b>正品保证</b>
	  <span>正品行货 放心选购</span>
	 </li>
	 <li>
	  <a href="#"><img src="images/slogen_30.png" data-bd-imgshare-binded="3"></a>
	  <b>七天无理由退换</b>
	  <span>七天无理由保障消费权益</span>
	 </li>
      <li>
	  <a href="#"><img src="images/slogen_31.png" data-bd-imgshare-binded="4"></a>
	  <b>天天低价</b>
	  <span>价格更低，质量更可靠</span>
	 </li>
	</ul>
  </div>
 </div>
<!--底部图层-->
<div class="phone_style">
 <div class="index_style">
   <span class="phone_number"><em class="iconfont icon-dianhua"></em>400-4565-345</span><span class="phone_title">客服热线 7X24小时 贴心服务</span>
 </div>
</div>
<div class="footerbox clearfix">
  <div class="clearfix">
   <div class="">
    <dl>
	 <dt>新手上路</dt>
	 <dd><a href="#">售后流程</a></dd>
     <dd><a href="#">购物流程</a></dd>
     <dd><a href="#">订购方式</a> </dd>
     <dd><a href="#">隐私声明 </a></dd>
     <dd><a href="#">推荐分享说明 </a></dd>
	</dl>
	<dl>
	 <dt>配送与支付</dt>
	 <dd><a href="#">保险需求测试</a></dd>
     <dd><a href="#">专题及活动</a></dd>
     <dd><a href="#">挑选保险产品</a> </dd>
     <dd><a href="#">常见问题 </a></dd>
	</dl>
	<dl>
	 <dt>售后保障</dt>
	 <dd><a href="#">保险需求测试</a></dd>
     <dd><a href="#">专题及活动</a></dd>
     <dd><a href="#">挑选保险产品</a> </dd>
     <dd><a href="#">常见问题 </a></dd>
	</dl>
	<dl>
	 <dt>支付方式</dt>
	 <dd><a href="#">保险需求测试</a></dd>
     <dd><a href="#">专题及活动</a></dd>
     <dd><a href="#">挑选保险产品</a> </dd>
     <dd><a href="#">常见问题 </a></dd>
	</dl>	
    <dl>
	 <dt>帮助中心</dt>
	 <dd><a href="#">保险需求测试</a></dd>
     <dd><a href="#">专题及活动</a></dd>
     <dd><a href="#">挑选保险产品</a> </dd>
     <dd><a href="#">常见问题 </a></dd>
	</dl>	   
   </div>
  </div>
 <div class="text_link">
   <p>
  <a href="#">关于我们</a>｜ <a href="#">公开信息披露</a>｜ <a href="#">加入我们</a>｜ <a href="#">联系我们</a>｜ <a href="#">版权声明</a>｜ <a href="#">隐私声明</a>｜ <a href="#">网站地图</a></p>
	 <p>蜀ICP备11017033号 Copyright ©2011 成都福际生物技术有限公司 All Rights Reserved. Technical support:CDDGG Group</p>
  </div>
  </div>
   <!--右侧菜单栏购物车样式-->
<div class="fixedBox">
  <ul class="fixedBoxList">
      <li class="fixeBoxLi user"><a href="User.html"> <span class="fixeBoxSpan iconfont icon-yonghu"></span> <strong>用户</strong></a> </li>
    <li class="fixeBoxLi cart_bd" style="display:block;" id="cartboxs">
		<p class="good_cart">0</p>
			<span class="fixeBoxSpan iconfont icon-cart"></span> <strong>购物车</strong>
			<div class="cartBox">
       		<div class="bjfff"></div><div class="message">购物车内暂无商品，赶紧选购吧</div>    </div></li>
    <li class="fixeBoxLi Service "> <span class="fixeBoxSpan iconfont icon-service"></span> <strong>客服</strong>
      <div class="ServiceBox">
        <div class="bjfffs"></div>
        <dl onclick="javascript:;">
		    <dt><img src="images/Service1.png"></dt>
		       <dd><strong>QQ客服1</strong>
		          <p class="p1">9:00-22:00</p>
		           <p class="p2"><a href="http://wpa.qq.com/msgrd?v=3&amp;uin=123456&amp;site=DGG三端同步&amp;menu=yes">点击交谈</a></p>
		          </dd>
		        </dl>
				<dl onclick="javascript:;">
		          <dt><img src="images/Service1.png"></dt>
		          <dd> <strong>QQ客服1</strong>
		            <p class="p1">9:00-22:00</p>
		            <p class="p2"><a href="http://wpa.qq.com/msgrd?v=3&amp;uin=123456&amp;site=DGG三端同步&amp;menu=yes">点击交谈</a></p>
		          </dd>
		        </dl>
	          </div>
     </li>
	 <li class="fixeBoxLi code cart_bd " style="display:block;" id="cartboxs">
			<span class="fixeBoxSpan iconfont icon-erweima"></span> <strong>微信</strong>
			<div class="cartBox">
       		<div class="bjfff"></div>
			<div class="QR_code">
			 <p><img src="images/erweim.jpg" width="150px" height="150px" style=" margin-top:10px;" /></p>
			 <p>微信扫一扫，关注我们</p>
			</div>		
			</div>
			</li>

    <li class="fixeBoxLi Home"> <a href="./"> <span class="fixeBoxSpan iconfont  icon-shoucang"></span> <strong>收藏</strong> </a> </li>
    <li class="fixeBoxLi Home"> <a href="./"> <span class="fixeBoxSpan iconfont  icon-zuji"></span> <strong>足迹</strong> </a> </li>
    <li class="fixeBoxLi Home"> <a href="./"> <span class="fixeBoxSpan iconfont  icon-fankui"></span> <strong>反馈</strong> </a> </li>
    <li class="fixeBoxLi BackToTop"> <span class="fixeBoxSpan iconfont icon-top"></span> <strong>返回顶部</strong> </li>
  </ul>
</div>
</body>
</html>