package com.corejava.immutable2;

import java.util.HashMap;

public class App {
public static void main(String[] args) {
	FakeStudent fs=new FakeStudent("Palaval");
	Student s=fs;
	HashMap<Student, String> hm= new HashMap<Student, String>();
	hm.put(s, "hello");
	
	Student s1=new Student("pjaga");
	hm.put(s1, "hello");
fs.setFakeStudent("ssssssssss");
	//s.setName("as");
	
	  System.out.println(hm.get(s));
	  
	  System.out.println(hm.get(s1));
	 
	
	StringBuffer sb=new StringBuffer("JP");
	StringBuffer sb1=sb.append("DJ");
	//System.out.println(sb1);
	//System.out.println(sb);
	
	String st=new String("PP").intern();
	String st2="PP";
	System.out.println(st==st2);
	String st1=st.concat("jd");
	System.out.println(st);
	System.out.println(st1);
}
}
