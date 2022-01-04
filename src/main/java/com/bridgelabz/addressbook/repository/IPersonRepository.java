package com.bridgelabz.addressbook.repository;

import com.bridgelabz.addressbook.model.PersonData;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonRepository extends JpaRepository<PersonData,Integer> {
    
}
