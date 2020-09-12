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

import com.prac.model.Employee;
import com.prac.model.EmployeeProj;
import com.prac.service.EmployeeDAO;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	EmployeeDAO employeeDAO;

	@GetMapping
	public List<Employee> getEmployees() {
		return employeeDAO.findAll();
	}

	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable long id) {
		return employeeDAO.findById(id);
	}

	@DeleteMapping("/{id}")
	public boolean deleteEmployee(@PathVariable long id) {
		return employeeDAO.deleteById(id);
	}

	@PostMapping
	public Employee addEmployee(@Valid @RequestBody Employee employee) {
		return employeeDAO.add(employee);

	}

	@GetMapping("/byName/{name}")
	public List<Employee> getEmployeeByName(@PathVariable String name) {
		return employeeDAO.findByName(name);
	}

	@GetMapping("/emproj")
	public List<EmployeeProj> getEmProj() {
		return employeeDAO.getEmployeeProj();
	}

	@GetMapping("/emaddr/{name}")
	public String[] getEmAddr(@PathVariable String name) {
		return employeeDAO.getAddresses(name);
	}


}
