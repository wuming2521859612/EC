package com.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.Product;
import com.service.IProductService;

@Controller
public class ProductController {
	@Autowired
	IProductService ProSer;
	public void setProSer(IProductService proSer) {
		ProSer = proSer;
	}
	
	@RequestMapping("jinju")
	public String jinju(String jinju,Map<String, Object> map) {
		System.out.println(jinju);
		Product pro = ProSer.selectByPrimaryKey(1);
		map.put("pro", pro);
		return "Product_Detailed";
	}
	
	@RequestMapping("/productlist")
	public String Productlist() {
		
		return "product_list";
	}
	
	
}
