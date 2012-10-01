package com.redhat.sa.demos.switchyard.hellows;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.switchyard.test.Invoker;
import org.switchyard.test.ServiceOperation;
import org.switchyard.test.SwitchYardRunner;
import org.switchyard.test.SwitchYardTestCaseConfig;
import org.switchyard.test.mixins.CDIMixIn;

@RunWith(SwitchYardRunner.class)
@SwitchYardTestCaseConfig(mixins = CDIMixIn.class, config = SwitchYardTestCaseConfig.SWITCHYARD_XML)
public class SayHelloTest {

	@ServiceOperation("SayHello")
	private Invoker service;

	@Test
	public void testSayHello() throws Exception {
		String message = "Thomas Q";
		String result = service.operation("sayHello").sendInOut(message)
				.getContent(String.class);

		// validate the results
		Assert.assertTrue(("Hello " + message + "!").equals(result));
	}

}
