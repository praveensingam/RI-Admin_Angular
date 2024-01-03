package com.ri.service;

import java.util.List;

import com.ri.bindings.AccountForm;
import com.ri.bindings.UnLockForm;

public interface AccountService {
	
	public String createUserAccount(AccountForm accountForm);
	
	public List<AccountForm> viewAccounts();
	
	public AccountForm getAccountById(Integer id);
	
	public String ChangeAccountStatus(Integer accId, String accountStatus);
	
	public String unlockUserAccount(UnLockForm unlock);

}
