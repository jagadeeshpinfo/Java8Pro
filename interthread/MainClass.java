package interthread;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {
public static void main(String[] args) {
	
	//Arrays.sort(null);
	MyRunable[] jobs= {new MyRunable("jagadeesh"),new MyRunable("hari"),new MyRunable("sai"),new MyRunable("ram")};
	ExecutorService service=Executors.newFixedThreadPool(3);
	for (MyRunable job : jobs) {
		
		service.submit(job);
		
	}
	service.shutdown();
}
}
