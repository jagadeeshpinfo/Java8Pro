package interthread;

public class MyRunable implements Runnable{
	
	String name;
	
	
	public MyRunable(String name) {
		//super();
		this.name = name;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name + "--job started by thread"+Thread.currentThread().getName() );
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(name +"===job comlemeted by"+Thread.currentThread().getName());
	}
	

}
