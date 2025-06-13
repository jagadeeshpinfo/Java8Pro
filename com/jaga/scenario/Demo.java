package com.jaga.scenario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
public static void main(String[] args) throws IOException {
	AAA a1=new AAA();
	a1.m1();
	System.out.println("Hello");
	
	
	try {
		int a=10;
		int b=10;
		int c=a/b;
		System.out.println(c);
		String s1=null;
		
		FileReader fr= new FileReader("");
		fr.read();
		s1.concat("");
	} catch (ArrayIndexOutOfBoundsException | ArithmeticException  e) {
		// TODO: handle exception
		System.out.println("Airt");
	}
	
}
}
