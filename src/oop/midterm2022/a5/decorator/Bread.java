package oop.midterm2022.a5.decorator;

public abstract class Bread {
	String description = "Bread";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
