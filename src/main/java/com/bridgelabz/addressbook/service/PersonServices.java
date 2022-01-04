package com.bridgelabz.addressbook.service;

import java.util.List;


import com.bridgelabz.addressbook.dto.PersonDTO;
import com.bridgelabz.addressbook.model.PersonData;
import com.bridgelabz.addressbook.repository.IPersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServices implements IPersonServices {

    @Autowired
    private IPersonRepository IPersonRepository;

    /**
     * this method is to get all person data
     * param :personDTO
     * @return personData
     */
    @Override
    public List<PersonData> getPersonData() {
        return IPersonRepository.findAll();
    }
    /**
     * this method is to get the  person data by Id
     * param :personDTO
     * param :id
     * @return personData
     */

    @Override
    public PersonData getPersonDataById(int id) {
        return IPersonRepository.findById(id).orElseThrow(()-> new RuntimeException());
    }

    /**
     * this method is to post the person data
     * param :personDTO
     * @return personData
     */
    @Override
    public PersonData addPersonData(PersonDTO personDTO) {
        PersonData personData = new PersonData(personDTO);
        return IPersonRepository.save(personData);
    }
    /**
     * This method is to update the person data
     * param :id
     * param :personDTO
     * @return PersonData which is updated
     */
    @Override
    public PersonData updatePersonData(int id, PersonDTO personDTO) {
        PersonData personData = this.getPersonDataById(id);
        personData.updatePersonData(personDTO);
        return IPersonRepository.save(personData);
    }
    /**
     * this method is to delete the personData by using the id
     * param :id
     */
    @Override
    public void deletePersonData(int id) {
        PersonData personData = this.getPersonDataById(id);
        IPersonRepository.delete(personData);
    }

}
