package com.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	@RequestMapping(value="htm/user_login_confirm_htm",method={RequestMethod.POST,RequestMethod.GET})
	public String ajaxProcess(HttpServletRequest req,HttpServletResponse res){
		HashMap<String,Object> map=new HashMap();
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		map.put("username",username);
		map.put("password",password);
		System.out.print("\n  model ");
		req.setAttribute("model", map);
		return "success";

	}
	
	

}
