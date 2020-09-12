package com.prac.repo;

import org.springframework.data.repository.CrudRepository;

import com.prac.model.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {

}
 