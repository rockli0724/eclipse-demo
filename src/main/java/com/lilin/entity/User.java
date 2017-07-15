package com.lilin.entity;

public class User {
	
	private Integer id;//
	private String name;//姓名
	private String password;//密码
	private String email;//邮箱
	private boolean enable;//是否可用
	private String[] ahthority;//权限
	private String[] resource;//资源
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	public String[] getAhthority() {
		return ahthority;
	}
	public void setAhthority(String[] ahthority) {
		this.ahthority = ahthority;
	}
	public String[] getResource() {
		return resource;
	}
	public void setResource(String[] resource) {
		this.resource = resource;
	}
	
	
	
	
	

}
