package com.example.demo.service;

import com.example.demo.repository.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestTrigger implements CommandLineRunner {


    @Autowired
    private TestRepo testRepo;


    @Autowired
    private TestService testService;

    @Override
    public void run(String... args) throws Exception {
        /*
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
        */
    }
}
