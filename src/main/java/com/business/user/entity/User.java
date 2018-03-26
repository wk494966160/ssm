package com.business.user.entity;

import com.business.base.entity.BaseEntity;

/**
 * 用户
 * @author wk
 *
 */
public class User extends BaseEntity<User> {
	
	private static final long serialVersionUID = -3252584278752830776L;
	
	/**
	 * 用户名
	 */
	private String name;
	/**
	 * 密码
	 */
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}
}
