package com.prac.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prac.model.Address;
import com.prac.service.AddressDAO;

@RestController
@RequestMapping("/addresses")
public class AddressController { 
	@Autowired
	AddressDAO addressDAO;

	@GetMapping
	public List<Address> getAddresss() {
		return addressDAO.findAll();
	}

	@GetMapping("/{id}")
	public Address getAddress(@PathVariable long id) {
		return addressDAO.findById(id);
	}

	@DeleteMapping("/{id}")
	public boolean deleteAddress(@PathVariable long id) {
		return addressDAO.deleteById(id);
	}

	@PostMapping
	public Address addAddress(@Valid @RequestBody Address address) {
		return addressDAO.add(address);

	}
}
