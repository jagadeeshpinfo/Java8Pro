package interthread.threadLocal;

public class ThreadLocalExample {
	
	public static void main(String[] args) {
		ThreadLocal l=new ThreadLocal() {
			public Object initialValue() {
				return "aaaa";
			}
		};
		System.out.println(l.get());
		l.set("jaga");
		System.out.println(l.get());
l.remove();
System.out.println(l.get());

Myt t=new Myt();
t.start();

		
	}

}
class Myt extends Thread{
	public void run() {
		/*
		 * ThreadLocal l=new ThreadLocal(); System.out.println(l.get()); l.set("jaga");
		 * System.out.println(l.get());
		 */

	}
}