package interthread;

public class A {
	public static void main(String[] args) throws InterruptedException {
		ThreadB b=new ThreadB();
		b.start();
		synchronized (b) {
			System.out.println("main thread has to call waitt method");
			b.wait();
			System.err.println("main thread got notification ");
			System.out.println(b.total);
			
		}
		//b.join();
		
	}



}
class ThreadB extends Thread{
	
	int  total=0;
	public void run() {
		synchronized(this) {
			System.out.println("child thread start calculation");
			for(int i=0;i<=100;i++) {
				total=total+i;
			}
			System.out.println("child giving notification call");
			this.notify();
		}
		
	}
}