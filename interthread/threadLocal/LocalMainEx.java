package interthread.threadLocal;

public class LocalMainEx {
	public static void main(String[] args) {
		CustomerThread c1=new CustomerThread(" customer thread-1");
		CustomerThread c2=new CustomerThread(" customer thread-2");

		CustomerThread c3=new CustomerThread(" customer thread-3");

		CustomerThread c4=new CustomerThread(" customer thread-4");

		CustomerThread c5=new CustomerThread(" customer thread-5");
		c1.start();
		c2.start();
		c3.start();
		c4.start();

	}

}
