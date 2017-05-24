package com.example.demo;

import com.example.demo.entities.TestEntity;
import com.example.demo.repository.TestRepo;
import com.example.demo.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private TestRepo testRepo;


	@Autowired
	private TestService testService;

	@Test
	public void testService() throws Exception {
		testService.insert("1", "123");

		TestEntity one = testRepo.findOne("1");
		System.out.println(one.getValue());

		try {
			// This will throw an exception and roll-back its transaction
			testService.doUpdates("1", "12345");

		} catch (RuntimeException e) {
			e.printStackTrace();
		}

		// should still find the old, unmodified value
		TestEntity two = testRepo.findOne("1");
		System.out.println(two.getValue());
	}
}
