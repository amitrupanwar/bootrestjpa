package com.prac.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

@Entity
public class Address {
	@Id
	@GeneratedValue
	long addressId; 

	@NotBlank
	@Length(min = 5)
	private String line1;
	private String line2;
	private String landMark;
	@NotBlank
	private String zipCode;

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long id) {
		this.addressId = id;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", line1=" + line1 + ", line2=" + line2 + ", landMark=" + landMark
				+ ", zipCode=" + zipCode + "]";
	}

}
