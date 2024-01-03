package com.ri.bindings;

import java.time.LocalDate;

public class AccountForm {
	
	private String fullName;
	private String email;
	private long mobileNo;
	private String gender;
	private LocalDate dob;
	private long ssn;
	private String activeSw;
	private Integer roleId;
	public AccountForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccountForm(String fullName, String email, long mobileNo, String gender, LocalDate dob, long ssn,
			String activeSw, Integer roleId) {
		super();
		this.fullName = fullName;
		this.email = email;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.dob = dob;
		this.ssn = ssn;
		this.activeSw = activeSw;
		this.roleId = roleId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public long getSsn() {
		return ssn;
	}
	public void setSsn(long ssn) {
		this.ssn = ssn;
	}
	public String getActiveSw() {
		return activeSw;
	}
	public void setActiveSw(String activeSw) {
		this.activeSw = activeSw;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
}
