package com.redhat.sa.demos.switchyard.hellows;

import java.util.logging.Logger;

import javax.inject.Inject;

import org.switchyard.component.bean.Service;

@Service(SayHello.class)
public class SayHelloBean implements SayHello {

	@Inject
	Logger logger;
	
	@Override
	public String sayHello(String name) {
		String retVal = new StringBuilder().append("Hello ").append(name).append("!").toString();
		logger.info(retVal);
		return retVal;
	}
}
