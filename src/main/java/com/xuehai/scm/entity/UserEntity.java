package com.xuehai.scm.entity;

public class UserEntity {

	private String userId;
	private String userName;
	private Integer age;
	
	

	public UserEntity(String userId, String userName, Integer age) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", userName=" + userName + ", age=" + age + "]";
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
