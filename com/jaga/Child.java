package com.jaga;
class Parent{

void m2(String s1,String s2){
System.out.println(s1 + ""+ s2);
}
}
public class Child extends Parent{
void m1(String s1,String s2){
System.out.println(s2);
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Child c=new Child();
	c.m2("a",null);

}

}
