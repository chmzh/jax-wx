package com.ws.test.client;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;

import com.ws.test.AccountService;
import com.ws.test.domain.Account;

public class AccountClient {
	
	public static void main(String[] args) {
		JaxWsPortProxyFactoryBean factoryBean = new JaxWsPortProxyFactoryBean();
		factoryBean.setServiceInterface(AccountService.class);
		try {
			factoryBean.setWsdlDocumentUrl(new URL("http://localhost:8888/jax/AccountService?WSDL"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		factoryBean.setNamespaceUri("http://test.ws.com/");
		factoryBean.setServiceName("AccountService");
		factoryBean.setPortName("AccountServiceEndpointPort");
		
		factoryBean.afterPropertiesSet();
		AccountService accountService = (AccountService)factoryBean.getObject();
		accountService.insertAccount(null);
	}
	
}
