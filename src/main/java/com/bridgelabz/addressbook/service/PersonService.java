package com.bridgelabz.addressbook.service;

import java.util.List;
import java.util.Optional;

import com.bridgelabz.addressbook.dto.PersonDto;
import com.bridgelabz.addressbook.model.PersonData;

import com.bridgelabz.addressbook.repository.IPersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonService implements IPersonService {
    @Autowired
	private IPersonRepository personRepository;

	/**
	 * @param PersonDTO
	 * @return : PersonData
	 */
	@Override
	public PersonData createPersonData(PersonDto personDTO) {
		PersonData contactData = null;
		contactData = new PersonData(1, personDTO);
		return personRepository.save(contactData);
	}

	/**
	 * @param PersonDTO
	 * @return : PersonData
	 */
	@Override
	public PersonData updatePersonDta(long id, PersonDto personDTO) {
		PersonData personData = this.getPersonDataById(id);
		personData.updatePersonData(personDTO);
		return personRepository.save(personData);
	}

	/**
	 * @param PersonDTO
	 * @return : PersonData
	 */
	@Override
	public List<PersonData> getPersonData() {
		return personRepository.findAll();
	}

	/**
	 * @param PersonDTO
	 * @return : PersonData
	 */
	@Override
	public PersonData getPersonDataById(long id) {
		return personRepository.findById(id);
	}

	@Override
	public void deletePersonData(long id) {
		PersonData personData = this.getPersonDataById(id);
		personRepository.delete(personData);
	}
}
