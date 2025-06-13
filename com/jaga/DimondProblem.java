package com.jaga;

import java.util.Collection;
import java.util.Hashtable;

public class DimondProblem implements DimondProblemInterface,DimondProblemInterface2,InterfaceWithStaticDemo,InterfaceWithStaticDemo2{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		DimondProblemInterface2.super.m1();
	//	Collection<E>
		//Hashtable<K, V>
	}
	
	public static void main(String[] args) {
		DimondProblem d=new DimondProblem();
		d.m1();
		InterfaceWithStaticDemo.staticMeth();
		InterfaceWithStaticDemo2.staticMeth();
	}

}
