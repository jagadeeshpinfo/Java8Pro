package interthread;

class Parent{
	static void m1() {
		System.out.println("Parent stsic m1 method");
		
	}
	void m2() {
		System.out.println("P arent method m2");
	}
}

class Child extends Parent{
	static void m4() {
		System.out.println("child m1");
	}
	void m2() {
		System.out.println(" child method m2");
	}
	static void m1() {
		
		System.out.println("child static m1 method");
		
	}
}
public class InheritanceTest {
	
	public static void main(String[] args) {
		Parent p1=new Parent();
		//p1.m1();
		//p1.m2();
		Child c1=new Child();
		c1.m1();
		c1.m2();
		
		Parent p2=new Child();
		p2.m1();
		
	p2.m2();
		
		//Child c2=new Parent();
	}

}
