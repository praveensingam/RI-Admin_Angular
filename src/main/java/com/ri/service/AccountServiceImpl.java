package com.ri.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ri.bindings.AccountForm;
import com.ri.bindings.UnLockForm;

@Service
public class AccountServiceImpl implements AccountService {

	@Override
	public String createUserAccount(AccountForm accountForm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccountForm> viewAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountForm getAccountById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ChangeAccountStatus(Integer id, String Status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String unlockUserAccount(UnLockForm unlock) {
		// TODO Auto-generated method stub
		return null;
	}

}
