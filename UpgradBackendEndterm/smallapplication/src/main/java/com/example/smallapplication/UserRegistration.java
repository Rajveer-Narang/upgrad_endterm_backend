package com.example.smallapplication;

public class UserRegistration {
	private String nm;
	private String age;
	private String email;
	private String address;
	private String ph;
	
	
	

	public String getnm() {
		return nm;
	}
	public void setnm(String nm) {
		this.nm = nm;
	}
	public String getage() {
		return age;
	}
	public void setage(String age) {
		this.age = age;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	public String getph() {
		return ph;
	}
	public void setph(String ph) {
		this.ph = ph;
	}
	@Override
	public String toString() {
		return "UserRegistration [ Name=" + nm + ",Age=" + age + ", Email-Id=" + email + ", Address=" + address + ", PhoneNumber=" + ph + "]";
	}
	
	
	

}
