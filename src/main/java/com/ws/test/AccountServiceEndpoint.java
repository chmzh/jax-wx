package com.ws.test;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.ws.test.domain.Account;

@WebService(serviceName = "AccountService")
@SOAPBinding(style = Style.RPC) 
public class AccountServiceEndpoint extends SpringBeanAutowiringSupport {
	@Autowired
	private AccountService biz;

	@WebMethod
	public void insertAccount(Account acc) {
		biz.insertAccount(acc);
	}

	@WebMethod
	public Account[] getAccounts(String name) {
		return biz.getAccounts(name);
	}
}
