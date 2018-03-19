package com.test;

public class Student {
	String name;
	String sirname;
	
	public Student() {
		
	}
	
	public Student(String name, String sirname) {
		super();
		this.name = name;
		this.sirname = sirname;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the sirname
	 */
	public String getSirname() {
		return sirname;
	}
	/**
	 * @param sirname the sirname to set
	 */
	public void setSirname(String sirname) {
		this.sirname = sirname;
	}

}
