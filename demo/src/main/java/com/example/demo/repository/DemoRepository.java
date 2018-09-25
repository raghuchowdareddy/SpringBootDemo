package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Demo;

public interface DemoRepository extends CrudRepository<Demo, Integer>{
 Demo findByName(String name);
}
