package com.jaga;

public class InterfaceDemo2 implements InterfaceDemo {
	public void printName() {
		System.out.println("SSS");
	}
public static void main(String[] args) {
	InterfaceDemo2 id=new InterfaceDemo2();
	id.printName();
}
}
