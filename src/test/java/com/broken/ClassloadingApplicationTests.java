package com.broken;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@SpringApplicationConfiguration(classes = {ClassloadingApplication.class})
@WebIntegrationTest("server.port:0")
@RunWith(SpringJUnit4ClassRunner.class)
public class ClassloadingApplicationTests {
	
	@Autowired
	Serv serv;

	@Test
	public void contextLoads() {
		assertEquals('S', serv.getIt());
	}

}
