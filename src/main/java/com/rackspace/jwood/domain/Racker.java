package com.rackspace.jwood.domain;

import org.hibernate.validator.constraints.NotEmpty;

public class Racker {
	@NotEmpty
	private String name;
	
	@NotEmpty
	private String title;

	private ArrayList strengths;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public ArrayList getStrengths() {
		return strengths;
	}
	public void addStrength(String strength) {
		this.strengths.add(strength);
	}
}
