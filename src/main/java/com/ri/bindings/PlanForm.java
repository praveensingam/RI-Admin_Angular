package com.ri.bindings;

import java.time.LocalDate;

public class PlanForm {
	
	private String planName;
	private LocalDate planStartDate;
	private LocalDate planEndDate;
	private String planCategory;
	//private String activeSw;
	public PlanForm() {

	}
	public PlanForm(String planName, LocalDate planStartDate, LocalDate planEndDate, String planCategory) {
		super();
		this.planName = planName;
		this.planStartDate = planStartDate;
		this.planEndDate = planEndDate;
		this.planCategory = planCategory;
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
}
