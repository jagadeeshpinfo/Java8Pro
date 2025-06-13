package pack;

public class IkmTest {
public IkmTest() {
	this(10);
}

public IkmTest(int i) {
	// TODO Auto-generated constructor stub
	this.i=i;
}
public void display() {
	class Decrementer{
		public void decremrnt() {
			i--;
		}
	}
	Decrementer d= new Decrementer();
	d.decremrnt();
	System.out.println("data="+i);
}
private int i;
public static void main(String[] args) {
	int i=0;
	IkmTest t= new IkmTest();
	t.display();
	System.out.println("data="+i);
}
}
