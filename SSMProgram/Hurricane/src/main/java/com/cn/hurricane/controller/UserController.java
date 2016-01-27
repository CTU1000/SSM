package com.cn.hurricane.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cn.hurricane.pojo.TestUser;
import com.cn.hurricane.service.TestUserService;


@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private TestUserService testUserService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		TestUser testUser = this.testUserService.getUserById(userId);
		model.addAttribute("user", testUser);
		return "showUser";
	}
}
