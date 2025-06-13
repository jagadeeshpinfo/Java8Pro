package com.corejava.immutable;

public class App {
public static void main(String[] args) {
	
	Addres homeAddr=new Addres("Rajam", "AP","India");
	
	Std jaga=new Std(1,"jagadeesh",homeAddr);
	
	System.out.println(jaga);
	Addres addrs=jaga.getAddress();
	addrs.setCity("Blr");
	addrs.setState("Karnataka");
	System.out.println(jaga);
}
}
