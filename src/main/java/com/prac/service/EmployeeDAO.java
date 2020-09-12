package com.prac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prac.model.Employee;
import com.prac.repo.EmployeeRepo;

@Service
public class EmployeeDAO {
	@Autowired
	EmployeeRepo employeeRepo; 

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return (List<Employee>) employeeRepo.findAll();
	}

	public Employee findById(long id) {
		// TODO Auto-generated method stub
		return employeeRepo.findById(id).get();
	}

	public boolean deleteById(long id) {
		// TODO Auto-generated method stub
		if (employeeRepo.existsById(id)) {
			employeeRepo.deleteById(id);
			return true;
		}
		return false;
	}

	public Employee add(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

}
