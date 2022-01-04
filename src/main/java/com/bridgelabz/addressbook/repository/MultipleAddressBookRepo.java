package com.bridgelabz.addressbook.repository;

import com.bridgelabz.addressbook.model.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MultipleAddressBookRepo extends JpaRepository<AddressBookData,Integer> {

}
