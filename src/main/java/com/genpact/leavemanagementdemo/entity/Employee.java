/**
 * 
 */
package com.genpact.leavemanagementdemo.entity;

import java.util.List;

import org.springframework.stereotype.Component;


/**
 * @author debabratakundu
 *
 */
public class Employee {

	private Long empId;

	private String firstName;

	private String lastName;

	private String designation;


	private Long mobNo;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Long empId, String firstName, String lastName, String designation,
			Long mobNo) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.designation = designation;
		this.mobNo = mobNo;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public Long getMobNo() {
		return mobNo;
	}

	public void setMobNo(Long mobNo) {
		this.mobNo = mobNo;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", designation="
				+ designation + ", addresses="  + ", mobNo=" + mobNo + "]";
	}


}
