package com.bridgelabz.addressbook.dto;

import lombok.Data;


public @Data class PersonDto {
    public String fName;
	public String lName;
	public String gender;
	public long phoneNumber;
	public String email;
	public String address;
	public String city;
	public String state;
	public String country;
	public String profilePic;
	
}
