package com.broken;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ApplicationTests {
	
	@Autowired
	MyUserRepo repo;

	@Test
	public void contextLoads() {
		assertTrue(repo.update(new MyUser()));
	}

}
