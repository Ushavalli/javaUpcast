package com.java.upcast;

public class Child extends Parent{
 @Override
public void one() {
	 System.out.println("Method one from child class");
	 
}
 @Override
	public void fresh() {
		 System.out.println("Method fresh from child class");
	}
 public void three() {
		System.out.println("child class own method");
	}
 public static void main(String[] args) {
	Child c = new Child();
	c.one();
	c.three();
	c.fresh();
	// Child u = (Child) new Parent();Downcasting cant be done in java
	 //u.two();
	 
	 
}
}
