
package org.tnsif.superkeyword;

//program to demonstrate an example of super keyword in terms of variable 

//parent class
public class Flower {
	
	private String name;

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//default constructor
	public Flower() {
		System.out.println("Flower -parent class");
	}

	//parameterized constructor
	public Flower(String name) {
		super();
		this.name = name;
	}
	
	
}