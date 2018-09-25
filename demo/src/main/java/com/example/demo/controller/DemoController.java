package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Demo;
import com.example.demo.service.IDemo;

@RestController
public class DemoController {

	@Autowired IDemo idemo;
	
//	@RequestMapping(value = "{name}", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
//	public Demo getDemo(@PathVariable String name) {
//		return idemo.getByName(name);
//	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public Demo getDemoByID(@PathVariable Integer id) {
		Optional<Demo> demoById =  idemo.getById(id);
		
		return demoById.get();
	}
	
	@RequestMapping(value = "add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Demo saveDemo(@RequestBody Demo demo) {
		return idemo.addDemo(demo);
	}
	
}
 