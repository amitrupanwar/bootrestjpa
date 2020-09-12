package com.prac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prac.model.Address;
import com.prac.repo.AddressRepo;

@Service
public class AddressDAO {
	@Autowired
	AddressRepo addressRepo;

	public List<Address> findAll() {
		// TODO Auto-generated method stub
		return (List<Address>) addressRepo.findAll();
	}

	public Address findById(long id) {
		// TODO Auto-generated method stub
		return addressRepo.findById(id).get();
	}

	public boolean deleteById(long id) {
		// TODO Auto-generated method stub
		if (addressRepo.existsById(id)) {
			addressRepo.deleteById(id);
			return true;
		}
		return false;
	}

	public Address add(Address address) {
		// TODO Auto-generated method stub
		return addressRepo.save(address);
	}
}
