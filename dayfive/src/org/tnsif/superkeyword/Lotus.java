
package org.tnsif.superkeyword;

//child class
public class Lotus extends Flower{
	
	private String name;
	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//default constructor
	public Lotus() {
		System.out.println("Flower parent class");
	}

	//parameterized constructor
	public Lotus(String name) {
		super();
		this.name = name;
	}

	public void display()
	{
		System.out.println(name);
		super.setName("Flower");
		System.out.println(super.getName());
	}


}