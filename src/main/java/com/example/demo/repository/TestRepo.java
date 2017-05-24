package com.example.demo.repository;

import com.example.demo.entities.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepo extends JpaRepository<TestEntity, String> {
}
