package com.patterns.builder;

public class Registration {
	
	private String userName;
	private String password;
	private String mobileNumber;
	private String name;
	private String email;
	private String address;
	
	
	public static class Builder{
		private String userName;
		private String password;
		private String mobileNumber;
		private String name;
		private String email;
		private String address;
		
		public Builder(String userName, String password) {
			this.userName=userName;
			this.password=password;
		}
		public Builder withMobileNumber(String mobileNumber){
			this.mobileNumber=mobileNumber;
			return this;
		}
		public Builder withMName(String mobileNumber){
			this.name=mobileNumber;
			return this;
		}
		public Builder withEmail(String mobileNumber){
			this.email=mobileNumber;
			return this;
		}
		public Builder withAddress(String mobileNumber){
			this.address=mobileNumber;
			return this;
		}
		
		public Registration build(){
			return new Registration(this);
		}
		
	}
	
	private Registration(Builder builder) {
		this.userName=builder.userName;
		this.mobileNumber=builder.mobileNumber;
		this.name=builder.name;
		this.password=builder.password;
		this.email=builder.email;
		this.address=builder.address;
	}
	
	
	
	

}
