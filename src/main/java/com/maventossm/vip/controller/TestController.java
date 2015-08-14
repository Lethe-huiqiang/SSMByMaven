package com.maventossm.vip.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maventossm.vip.model.User;
import com.maventossm.vip.service.UserService;


@Controller
@RequestMapping("/test")
public class TestController {
	private UserService userService;

		/**
		 * 获取用户列表
		 * 
		 */
		@RequestMapping("/userList")
		public String showUserInfo(ModelMap map){
			List<User> userList=userService.getUsers();
			System.out.println("===========用户列表=======");
			System.out.println(userList);
			
			map.addAttribute("result", userList);
			return "showUserList";
		}
		/**
		 * 获取一个用户
		 * 
		 */
		@RequestMapping("/getUserById")
		public String getUserById(ModelMap map){
		User user=userService.getUserById(1);
			System.out.println("===========用户列表=======");
			System.out.println(user);
			
			map.addAttribute("result", user);
			return "getUserById";
		}

		public UserService getUserService() {
			return userService;
		}
		@Autowired
		public void setUserService(UserService userService) {
			this.userService = userService;
		}
		
}
