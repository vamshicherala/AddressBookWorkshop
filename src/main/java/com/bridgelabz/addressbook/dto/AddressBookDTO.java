package com.bridgelabz.addressbook.dto;

import com.bridgelabz.addressbook.model.PersonData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressBookDTO {
    private String addressBookName;
    private List<PersonData> personList = new ArrayList<>();
}
