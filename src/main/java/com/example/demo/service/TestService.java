package com.example.demo.service;

import com.example.demo.entities.TestEntity;
import com.example.demo.repository.TestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class TestService {

    @Autowired
    private TestRepo testRepo;

    @Transactional
    public void doUpdates(String id, String value ) {
        insert(id, value);
       throw new RuntimeException();
    }

    @Transactional
    public void insert(String id, String value) {
        TestEntity testEntity =new TestEntity();

        testEntity.setId(id);
        testEntity.setValue(value);

        testRepo.save(testEntity);
    }
}
