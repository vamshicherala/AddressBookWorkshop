package com.bridgelabz.addressbook.model;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * This class is a Model
 * which is used to store data in the repository
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AddressBookData implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int aId;
    @Column
    private String addressBookName;

    @OneToMany(mappedBy = "addressBookData" , fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    private List<PersonData> personList;

    public AddressBookData(AddressBookDTO addressBookDTO){
        this.addressBookName = addressBookDTO.getAddressBookName();
        this.personList = addressBookDTO.getPersonList();
    }

    public void updateAddressBookData(AddressBookDTO addressBookDTO) {
        this.addressBookName = addressBookDTO.getAddressBookName();
    }

}
