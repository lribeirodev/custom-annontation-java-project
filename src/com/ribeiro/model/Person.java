package com.ribeiro.model;

import static com.ribeiro.constants.ModeUtils.AGE;
import static com.ribeiro.constants.ModeUtils.NAME;
import static com.ribeiro.constants.ModeUtils.REVERSE;

import com.ribeiro.annotation.StringUtils;

public class Person {
	
	public Person(String firstName, String lastName, Integer age) {
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@StringUtils(mode = NAME)
	private String firstName;
	
	@StringUtils(mode = NAME, reverse = REVERSE)
	private String lastName;
	
	@StringUtils(mode = AGE)
	private Integer age;
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public Integer getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "["+firstName+" , "+lastName+" , "+age+"]";
	}
}
