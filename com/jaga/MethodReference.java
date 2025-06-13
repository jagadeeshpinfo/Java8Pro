package com.jaga;

public class MethodReference {
public static void main(String[] args) {
	/*
	 * FunctionalInterfaceDemo fid=()->System.out.println("implemenation of metod");
	 * fid.singleAbsMethod();
	 */
	//code resuable
	
	FunctionalInterfaceDemo fidm= Test::testm1;
	//fidm.singleAbsMethod();
}//

}
class Test{
 static void testm1() {
		System.out.println("testing m1");
	}
}