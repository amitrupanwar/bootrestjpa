package com.prac.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.prac.model.Employee;
import com.prac.model.EmployeeProj;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {
	// Default filter by Field function
	public List<Employee> findByName(String name);

	@Query(value = "select new com.prac.model.EmployeeProj(e.name, p.name) from Employee e inner join e.projects p")
	public List<EmployeeProj> getEmployeeProj();

	@Query(value = "select a.line1 from Employee e inner join e.addresses a where e.name = :name")
	public String[] getAddresses(String name);

}
