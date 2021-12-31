package com.bridgelabz.addressbook.repository;

import com.bridgelabz.addressbook.model.PersonData;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonRepository extends JpaRepository<PersonData, Long> {
    
}
