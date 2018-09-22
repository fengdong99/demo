package com.xuehai.scm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.xuehai.scm.entity.UserEntity;

@Service
public class UserService {

	public List<UserEntity> selectUserInfo(String userId) {
		List<UserEntity> list = new ArrayList<>();
		list.add(new UserEntity("1","张三",18));
		list.add(new UserEntity("2","李四",23));
		list.add(new UserEntity("3","王五",26));
		return list;
	}

}
