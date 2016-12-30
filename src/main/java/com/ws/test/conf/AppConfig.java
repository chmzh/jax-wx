package com.ws.test.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.ws.test.controller")
@ImportResource("/WEB-INF/spring.xml")
@EnableWebMvc
public class AppConfig {
	/*
	@Bean
	public SimpleJaxWsServiceExporter simpleJaxWsServiceExporter(){
		SimpleJaxWsServiceExporter exporter = new SimpleJaxWsServiceExporter();
		exporter.setBaseAddress("http://localhost:8080/jax-ws/");
		return exporter;
	}
	
	@Bean
	public AccountServiceEndpoint accountServiceEndpoint(){
		return new AccountServiceEndpoint();
	}
	
	@Bean
	public JaxWsPortProxyFactoryBean accountWebService(){
		JaxWsPortProxyFactoryBean factoryBean = new JaxWsPortProxyFactoryBean();
		factoryBean.setServiceInterface(AccountService.class);
		try {
			factoryBean.setWsdlDocumentUrl(new URL("http://localhost:8888/jax-ws/AccountServiceEndpoint?WSDL"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		factoryBean.setNamespaceUri("http://com.ws.test/");
		factoryBean.setServiceName("AccountService");
		factoryBean.setPortName("AccountServiceEndpointPort");
		return factoryBean;
	}
	@Bean
	public AccountClientImpl accountClientImpl(){
		AccountClientImpl clientImpl = new AccountClientImpl();
		clientImpl.setService((AccountService)accountWebService().getJaxWsService());
		return clientImpl;
	}
	*/
}
