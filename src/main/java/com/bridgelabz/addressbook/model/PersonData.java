package com.bridgelabz.addressbook.model;

import com.bridgelabz.addressbook.dto.PersonDto;

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
    
    public PersonData(long personId, PersonDto personDTO) {
		super();
		this.personId = personId;
		this.fName = personDTO.fName;
		this.lName = personDTO.lName;
		this.gender = personDTO.gender;
		this.phoneNumber = personDTO.phoneNumber;
		this.email = personDTO.email;
		this.address = personDTO.address;
		this.city = personDTO.city;
		this.state = personDTO.state;
		this.country = personDTO.country;
		this.profilePic = personDTO.profilePic;
	}

	public void updatePersonData(PersonDto personDTO) {
		this.fName = personDTO.fName;
		this.lName = personDTO.lName;
		this.gender = personDTO.gender;
		this.phoneNumber = personDTO.phoneNumber;
		this.email = personDTO.email;
		this.address = personDTO.address;
		this.city = personDTO.city;
		this.state = personDTO.state;
		this.country = personDTO.country;
		this.profilePic = personDTO.profilePic;

	}
}
