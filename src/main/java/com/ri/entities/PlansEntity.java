package com.ri.entities;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PlansEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer planId;
	private String planName;
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private String planCategory;
	private String activeSw;
	@ManyToOne
	@JoinColumn(name="accId")
	private AccountsEntity accEntity;
	
	public PlansEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PlansEntity(Integer planId, String planName, LocalDate planStartDate, LocalDate planEndDate,
			String planCategory, String activeSw, AccountsEntity accEntity) {
		super();
		this.planId = planId;
		this.planName = planName;
		this.planStartDate = planStartDate;
		this.planEndDate = planEndDate;
		this.planCategory = planCategory;
		this.activeSw = activeSw;
		this.accEntity = accEntity;
	}
	public Integer getPlanId() {
		return planId;
	}
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public LocalDate getPlanStartDate() {
		return planStartDate;
	}
	public void setPlanStartDate(LocalDate planStartDate) {
		this.planStartDate = planStartDate;
	}
	public LocalDate getPlanEndDate() {
		return planEndDate;
	}
	public void setPlanEndDate(LocalDate planEndDate) {
		this.planEndDate = planEndDate;
	}
	public String getPlanCategory() {
		return planCategory;
	}
	public void setPlanCategory(String planCategory) {
		this.planCategory = planCategory;
	}
	public String getActiveSw() {
		return activeSw;
	}
	public void setActiveSw(String activeSw) {
		this.activeSw = activeSw;
	}
	public AccountsEntity getAccEntity() {
		return accEntity;
	}
	public void setAccEntity(AccountsEntity accEntity) {
		this.accEntity = accEntity;
	}

}
