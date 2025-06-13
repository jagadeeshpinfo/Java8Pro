package interthreadProducerConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//consumer class

class Cons implements Runnable{
	
	BlockingQueue<Integer> bq;
	
	public Cons(BlockingQueue<Integer> bq) {
		this.bq=bq;
		Thread cons=new Thread(this);
		cons.start();
	}
	public void run() {
		int i=0;
		while(true) {
			try {
				Thread.sleep(500);
				System.out.println("Consumer : "+ bq.take());//consume data 
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
}

//producer class

class Prod implements Runnable{
	
	BlockingQueue<Integer> bq;
	
	public Prod(BlockingQueue<Integer> bq) {
		this.bq=bq;
		Thread prod=new Thread(this);
		prod.start();
	}
	public void run() {
		int i=0;
		while(true) {
			
			System.out.println("Producer : "+ i);
			try {
				Thread.sleep(500);
				bq.put(i++);
				
			} catch (Exception e) {
				e.printStackTrace(); 
			}
			
		}
	}
	
}

public class ProducerConsumerBlockingQueue {
	
	public static void main(String[] args) {
		
		BlockingQueue<Integer> bq=new ArrayBlockingQueue<Integer>(2);
		new Prod(bq);
		new Cons(bq);
		
	}

}
