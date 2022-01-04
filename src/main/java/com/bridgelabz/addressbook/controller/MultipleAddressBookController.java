package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.dto.PersonDTO;
import com.bridgelabz.addressbook.dto.ResponseDTO;
import com.bridgelabz.addressbook.model.AddressBookData;
import com.bridgelabz.addressbook.model.PersonData;
import com.bridgelabz.addressbook.service.IMultipleAddressBookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class MultipleAddressBookController {


    @Autowired
    private IMultipleAddressBookServices multipleAddressBookServices;

    @PostMapping("/post")
    public ResponseEntity<ResponseDTO> addingPerson(@RequestBody AddressBookDTO addressBookDTO){
        AddressBookData addressBookData = multipleAddressBookServices.addAddressBookData(addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("post data is Successful", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    @PostMapping("/add/{id}")
    public ResponseEntity<ResponseDTO> addPersonData(@PathVariable int id, @RequestBody PersonDTO personDTO){
        PersonData personData = multipleAddressBookServices.addPersonDataInAddressBook(id,personDTO);
        ResponseDTO responseDTO = new ResponseDTO("post data is Successful", personData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<ResponseDTO> getAddressBook(){
        List<AddressBookData> addressBookList = multipleAddressBookServices.getAddressBookData();
        ResponseDTO responseDTO = new ResponseDTO("Get call Successful", addressBookList);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    @GetMapping("/get/{aId}")
    public ResponseEntity<ResponseDTO> getPersonData(@PathVariable int aId){
        AddressBookData addressBookData = multipleAddressBookServices.getPersonDataFromAddressBook(aId);
        ResponseDTO responseDTO = new ResponseDTO("Get call Successful", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable int aId,@RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = multipleAddressBookServices.updateAddressBookData(aId,addressBookDTO);
        ResponseDTO respDTO = new ResponseDTO("created address book successfully", addressBookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @DeleteMapping("/Delete/{id}")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable int addressbookId) {
        multipleAddressBookServices.deleteAddressBookData(addressbookId);
        ResponseDTO respDTO = new ResponseDTO("Deleted AddressBook data Successfully",  + addressbookId);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

}
