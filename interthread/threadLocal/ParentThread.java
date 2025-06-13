package interthread.threadLocal;

public class ParentThread extends Thread{
	
	public static void main(String[] args) {
		ParentThread pt=new ParentThread();
		pt.start();
	}
	

}
class ChildThread extends Thread{
	public void run() {
		System.out.println("Parent thread : "+ParentThreadEx.tl.get());//null
	//parent thread local var by defult not available to chaild
	}
}

class ParentThreadEx extends Thread{
	
	static ThreadLocal tl=new ThreadLocal();
	public void run() {
		tl.set("aa");
		System.out.println("Child val:"+tl.get());
		ChildThread ct=new ChildThread();
		ct.start();
	}
	
}
