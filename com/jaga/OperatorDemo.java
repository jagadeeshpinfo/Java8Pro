package com.jaga;

import java.util.Arrays;
import java.util.List;

public class OperatorDemo {
public static void main(String[] args) {
	Employee e1=new Employee(1, "A");
	Employee e2=new Employee(2, "B");
	Employee e3=new Employee(3, "C");
	Employee e4=new Employee(4, "D");
	
	List<Employee> empList=Arrays.asList(e1,e2,e3,e4);
	List<Integer> integerList=Arrays.asList(10,2,3,10);
	
	empList.stream().filter(e->e.getId()%2==0).map(e->e.getName()).
	forEach(e->System.out.println(e));
	empList.stream().filter(e->e.getId()%2==0).//map(e->e.getName()).
	forEach(e->System.out.println(e.getId() +" "+e.getName()));
	
	empList.stream().filter(e->e.getId()%2==0).map(e->
	{
		System.out.println(e.get());
		e.get();
		return e.getName();
	}).
	forEach(e->System.out.println(e));
	
	int s=integerList.stream().reduce((a1,a2)->a1+a2).get();
	System.out.println("sum-->"+s);
}
}
class Employee{
	private int id;
	private String name;
	String get() {
		return "helo";
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
