package com.wise.commonadapter;

public class JavaBean {
	
	private String title;
	private String 	decription;
	private String time;
	private String phone;
	private boolean isCheck;
	
	
	public JavaBean() {
		super();
	}


	public JavaBean(String title, String decription, String time, String phone,
			boolean isCheck) {
		super();
		this.title = title;
		this.decription = decription;
		this.time = time;
		this.phone = phone;
		this.isCheck = isCheck;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDecription() {
		return decription;
	}


	public void setDecription(String decription) {
		this.decription = decription;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public boolean isCheck() {
		return isCheck;
	}


	public void setCheck(boolean isCheck) {
		this.isCheck = isCheck;
	}
	
	
	
	

}
