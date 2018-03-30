package com.ws.cxf.spring.tomcat.server;

import javax.jws.WebService;

@WebService
public interface HelloService {
	
	public String sayHello(String name);
	
}
