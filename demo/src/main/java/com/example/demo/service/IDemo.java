package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.Demo;

public interface IDemo {
	public Demo getByName(String name) ;
	public Demo addDemo(Demo demo) ;
	public Optional<Demo> getById(Integer id);
}
