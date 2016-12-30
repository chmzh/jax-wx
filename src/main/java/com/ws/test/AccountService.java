package com.ws.test;

import java.util.List;

import com.ws.test.domain.Account;

public interface AccountService {
	public void insertAccount(Account account);

	public Account[] getAccounts(String name);
}
