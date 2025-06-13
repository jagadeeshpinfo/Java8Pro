package interthread.threadLocal;

import java.util.Objects;

public class CustomerThread extends Thread{
	
	static Integer custId=0;
	String name;
	private static  ThreadLocal tl=new ThreadLocal() {
		
		protected Object initialValue() {
		
			return ++custId;
		}
	};
	
	CustomerThread(String name){
		super(name);

		//this.name=name;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Excuting his cust Id : "+ 
	tl.get());
	}

}
