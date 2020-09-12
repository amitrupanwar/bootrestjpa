package com.prac.repo;

import org.springframework.data.repository.CrudRepository;

import com.prac.model.Address;

public interface AddressRepo extends CrudRepository<Address, Long> {

}
 