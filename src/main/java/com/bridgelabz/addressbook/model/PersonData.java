package com.bridgelabz.addressbook.model;

import lombok.Data;


public @Data class PersonData {
    private long personId;
	private String fName;
	private String lName;
	private String gender;
	private long phoneNumber;
	private String email;
	private String address;
	private String city;
	private String state;
	private String country;
	private String profilePic;
}
