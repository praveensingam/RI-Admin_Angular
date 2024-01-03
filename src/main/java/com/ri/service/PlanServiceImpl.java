package com.ri.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ri.bindings.PlanForm;
import com.ri.bindings.UnLockForm;

@Service
public class PlanServiceImpl implements PlanService {

	@Override
	public boolean createPlan(PlanForm planForm) {
		
		return false;
	}

	@Override
	public List<PlanForm> viewPlans() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlanForm getPlanById(Integer planId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String changePlanStatus(Integer planId, String planStatus) {
		// TODO Auto-generated method stub
		return null;
	}

}
