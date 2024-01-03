package com.ri.service;

import com.ri.bindings.DashBoardCard;
import com.ri.bindings.LoginForm;

public interface UserService {
	
	public String logIn(LoginForm login);
	
	public boolean recoverPwd(String email);
	
	public DashBoardCard getDashBoardInfo();
	

}
