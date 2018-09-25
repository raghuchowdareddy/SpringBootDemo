package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Demo {
 
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Integer id  = null;
  private String name = null;
  private String location = null;
  private String author = null;
  

  public Demo() {
	
  }
 
public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

  
}
