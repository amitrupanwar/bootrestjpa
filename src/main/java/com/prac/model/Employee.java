package com.prac.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class Employee {
	@Id
	@GeneratedValue 
	private long employeeId;
	@NotBlank(message = "Name is Mandatory")
	private String name;
	@Min(value = 18, message = "Minimum Age 18")
	@Max(value = 65, message = "Minimum Age 65")
	private int age;
	@Email(message = "Email is not valid")
	private String email;
 
	@OneToMany(targetEntity = Address.class, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "employeeId", referencedColumnName = "employeeId")
	List<Address> addresses;

	@OneToMany(targetEntity = Project.class)
	List<Project> projects;

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long id) {
		this.employeeId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", age=" + age + ", email=" + email
				+ ", addresses=" + addresses + ", projects=" + projects + "]";
	}

}
