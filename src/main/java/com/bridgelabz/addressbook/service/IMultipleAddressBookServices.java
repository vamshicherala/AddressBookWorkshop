package com.bridgelabz.addressbook.service;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.dto.PersonDTO;
import com.bridgelabz.addressbook.model.AddressBookData;
import com.bridgelabz.addressbook.model.PersonData;

import java.util.List;

public interface IMultipleAddressBookServices {

    AddressBookData addAddressBookData(AddressBookDTO addressBookDTO);

    PersonData addPersonDataInAddressBook(int id, PersonDTO personDTO);

    List<AddressBookData> getAddressBookData();

    AddressBookData getPersonDataFromAddressBook(int aId);

    AddressBookData updateAddressBookData(int aId, AddressBookDTO addressBookDTO);

    void deleteAddressBookData(int addressbookId);
}
