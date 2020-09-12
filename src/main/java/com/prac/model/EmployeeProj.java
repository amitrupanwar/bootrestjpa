package com.prac.model;

public class EmployeeProj {
	private String employeeName;
	private String projectName;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public String toString() {
		return "EmployeeProj [employeeName=" + employeeName + ", projectName=" + projectName + "]";
	}

	public EmployeeProj() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeProj(String employeeName, String projectName) {
		super();
		this.employeeName = employeeName;
		this.projectName = projectName;
	}

}
