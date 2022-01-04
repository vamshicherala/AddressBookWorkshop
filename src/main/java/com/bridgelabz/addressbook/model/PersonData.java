package com.bridgelabz.addressbook.model;

import javax.persistence.*;

import com.bridgelabz.addressbook.dto.PersonDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 * This class is a Model 
 * which is used to store data in the repository
 */
@Entity
@Table(name = "addressbook_data")
@AllArgsConstructor
@NoArgsConstructor
public @Data class PersonData implements Serializable {

    //Attributes or properties for the Person
    @Id
    private int id;
    @Column(name = "FirstName")
    private String firstName;
    @Column(name = "LastName")
    private String lastName;
    @Column(name = "Gender")
    private String gender;
    @Column(name = "PhoneNumber")
    private long phoneNumber;
    @Column(name = "Email")
    private String email;
    @Column(name = "Address")
    private String address;
    @Column(name = "City")
    private String city;
    @Column(name = "Country")
    private String country;

    @ManyToOne
    @JoinColumn(name = "aId")
    private AddressBookData addressBookData;

    /**
     * This method is to Assign the data
     * param :personDTO
     */

    public PersonData(PersonDTO personDTO){
        this.id = personDTO.getId();
        this.firstName = personDTO.getFirstName();
        this.lastName = personDTO.getLastName();
        this.gender = personDTO.getGender();
        this.phoneNumber = personDTO.getPhoneNumber();
        this.email = personDTO.getEmail();
        this.address = personDTO.getAddress();
        this.city = personDTO.getCity();
        this.country = personDTO.getCountry();
    }

    public void updatePersonData(PersonDTO personDTO) {
        this.firstName = personDTO.getFirstName();
        this.lastName = personDTO.getLastName();
        this.gender = personDTO.getGender();
        this.phoneNumber = personDTO.getPhoneNumber();
        this.email = personDTO.getEmail();
        this.address = personDTO.getAddress();
        this.city = personDTO.getCity();
        this.country = personDTO.getCountry();
    }

}