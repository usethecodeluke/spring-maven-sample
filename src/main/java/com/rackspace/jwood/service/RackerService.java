package com.rackspace.jwood.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rackspace.jwood.domain.Racker;

@Service
public class RackerService {
	private List<Racker> rackerList = new LinkedList<Racker>();
	
	RackerService() {
		Racker racker1 = new Racker();
		racker1.setName("Joe Smith");
		racker1.setTitle("Developer I");
		racker1.addStrength("Activator");
		racker1.addStrength("Ideation");
		racker1.addStrength("Command");
		rackerList.add(racker1);
		
		Racker racker2 = new Racker();
		racker2.setName("Bobby Tables");
		racker2.setTitle("Developer II");
		rackerList.add(racker2);

		Racker racker3 = new Racker();
		racker3.setName("Richard Stallman");
		racker3.setTitle("Senior Manager");
		rackerList.add(racker3);
	}
	
	public List<Racker> findAll() {
		return rackerList;
	}
	
	public void add(Racker racker) {
		rackerList.add(racker);
	}
}
