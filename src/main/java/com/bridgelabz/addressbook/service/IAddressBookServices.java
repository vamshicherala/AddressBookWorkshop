package com.bridgelabz.addressbook.service;

import java.util.List;
import com.bridgelabz.addressbook.dto.PersonDTO;
import com.bridgelabz.addressbook.model.PersonData;


public interface IAddressBookServices {

    List<PersonData> getPersonData();

    PersonData getPersonDataById(int id);

    PersonData addPersonData(PersonDTO personDTO);

    PersonData updatePersonData(int id, PersonDTO personDTO);

    void deletePersonData(int id);
    
}
