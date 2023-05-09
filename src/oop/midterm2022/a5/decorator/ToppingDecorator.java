package oop.midterm2022.a5.decorator;

public abstract class ToppingDecorator extends Bread {
	Bread bread;

	public abstract String getDescription();
	public abstract double cost();
}
