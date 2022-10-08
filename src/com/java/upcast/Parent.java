package com.java.upcast;

public class Parent {
	public void one() {
		 System.out.println("Method one from Parent class");

	}
	public void two() {
		 System.out.println("Method two from Parent class");

	}
	public void fresh() {
		 System.out.println("Method fresh from Parent class");

	}
public static void main(String[] args) {
	Parent p= new Child();//upcasting done
	p.one(); //overridden method
	p.fresh(); //overridden methods alone can be called from child class to parent class
	p.two();
}
}
