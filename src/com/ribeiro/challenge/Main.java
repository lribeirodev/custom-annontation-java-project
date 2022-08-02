package com.ribeiro.challenge;

import com.ribeiro.handler.HandlerStringUtils;
import com.ribeiro.model.Person;

public class Main {

	public static void main(String[] args) {
		Person p = new Person("lucas","ribeiro",27);
		HandlerStringUtils handler = new HandlerStringUtils();
		handler.proccess(p);
		System.out.println(p.toString());
	}

}
