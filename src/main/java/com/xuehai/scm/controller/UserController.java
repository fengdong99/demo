package com.xuehai.scm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xuehai.scm.entity.UserEntity;
import com.xuehai.scm.service.UserService;

@RestController
@RequestMapping(value= {"/user",""})
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value= {"/userInfo"})
	public Map<String, Object> selectUserInfo(String userId){
		Map<String, Object> result = new HashMap<>();
		List<UserEntity> userList =  userService.selectUserInfo(userId);
		result.put("userList", userList);
		return result;
		
	}

}
