package com.rackspace.jwood.domain;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

public class Racker {
	private Integer rackerId;

	@NotEmpty
	private String name;
	
	@NotEmpty
	private String title;

	private List<String> strengths = new LinkedList<String>();

	public Integer getId() {
		return rackerId;
	}
	public void setId(Integer rackerId) {
		this.rackerId = rackerId;
	}
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
	public List<String> getStrengths() {
		return strengths;
	}
	public void addStrength(String strength) {
		this.strengths.add(strength);
	}
}
