package com.bridgelabz.addressbook.service;

import java.util.List;
import java.util.Optional;


import com.bridgelabz.addressbook.dto.PersonDto;
import com.bridgelabz.addressbook.model.PersonData;


import org.springframework.stereotype.Service;

@Service
public interface IPersonService {
    PersonData createPersonData(PersonDto personDTO);

	PersonData updatePersonDta(long id, PersonDto personDTO);

	List<PersonData> getPersonData();

	PersonData getPersonDataById(long id);

	void deletePersonData(long id);
}
