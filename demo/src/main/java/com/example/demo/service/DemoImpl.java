package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Demo;
import com.example.demo.repository.DemoRepository;

@Service
public class DemoImpl implements IDemo{

	@Autowired DemoRepository repository;
	
	@Override
	public Demo getByName(String name) {
		return repository.findByName(name);
	}

	@Override
	public Demo addDemo(Demo demo) {
		return repository.save(demo);
	}
	
	@Override
	public Optional<Demo> getById(Integer id) {
		return repository.findById(id);
		
	}

}
