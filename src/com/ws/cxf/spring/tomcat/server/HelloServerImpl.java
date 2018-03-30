package com.ws.cxf.spring.tomcat.server;

import javax.jws.WebService;
import org.springframework.stereotype.Component;

@WebService
@Component
public class HelloServerImpl implements HelloService {

	/**
	 * 发布地址 : http://localhost:8080/WebService_CXF_Spring_Tomcat_Server_1/ws
	 * 到达控制台
	 */
	@Override
	public String sayHello(String name) {
		return "Hello : " + name;
	}

}
