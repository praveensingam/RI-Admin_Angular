package com.ri.service;

import java.util.List;

import com.ri.bindings.PlanForm;

public interface PlanService {
	
	public boolean createPlan(PlanForm planForm);
	
	public List<PlanForm> viewPlans();
	
	public PlanForm getPlanById(Integer planId);
	
	public String changePlanStatus(Integer planId,String planStatus);

}
