package com.ri.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class AccountsEntity {
	@Id
	private Integer accId;
	private String fullName;
	private String email;
	private String password;
	private LocalDate dob;
	private long ssn;
	private long mobileNo;
	private String gender;
	private String accountStatus;
	private String activeSw;
	
	private Integer roleId;
	@OneToMany(mappedBy = "accEntity")
	private List<PlansEntity> plans;
	
	public AccountsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccountsEntity(Integer accId, String fullName, String email, String password, LocalDate dob, long ssn,
			long mobileNo, String gender, String accountStatus, String activeSw, Integer roleId,
			List<PlansEntity> plans) {
		super();
		this.accId = accId;
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.ssn = ssn;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.accountStatus = accountStatus;
		this.activeSw = activeSw;
		this.roleId = roleId;
		this.plans = plans;
	}
	public Integer getAccId() {
		return accId;
	}
	public void setAccId(Integer accId) {
		this.accId = accId;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
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
	public List<PlansEntity> getPlans() {
		return plans;
	}
	public void setPlans(List<PlansEntity> plans) {
		this.plans = plans;
	}
}
