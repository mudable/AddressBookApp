package com.bridgelabz.addressbookapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;

@RestController
@RequestMapping("/addressbookapp")
public class AddressBookAppController {
	private static final AddressBookDTO addressBookDTO = null;

	@RequestMapping(value = { "/get" })
	public ResponseEntity<ResponseDTO> getAddressBookData() {
		AddressBookData addressbookData = null;
		addressbookData = new AddressBookData(151, new AddressBookDTO("gulbarga", "karnatka"));
		ResponseDTO respDTO = new ResponseDTO("Get call Successful:", addressbookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@GetMapping("/get/{pinCode}")
	public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("pinCode") int pinCode) {
		AddressBookData addressbookData = null;
		addressbookData = new AddressBookData(pinCode, new AddressBookDTO("mumbai", "Maharashtra"));
		ResponseDTO respDTO = new ResponseDTO("Get call for pinCode Successful:", addressbookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addAddressBookData(@RequestBody AddressBookDTO addressbookDTO) {
		AddressBookData addressbookData = null;
		addressbookData = new AddressBookData(1, addressbookDTO);
		ResponseDTO respDTO = new ResponseDTO("Create AddressBook Data:", addressbookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}

	@PutMapping("/update/{pinCode}")
	public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("pinCode") int pinCode,
			@RequestBody AddressBookDTO empPayrollDTO) {
		AddressBookData addressbookData = null;
		addressbookData = new AddressBookData(pinCode, addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Update AddressBook Successful:", addressbookData);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);

	}

	@DeleteMapping("/delete/{pinCode}")
	public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("pinCode") int pinCode) {
		ResponseDTO respDTO = new ResponseDTO("Deleted Successful,Deleted Code:", pinCode);
		return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
	}
}