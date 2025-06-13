package pack;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
class A{
	 void m1() {
		System.out.println("A");
	}
	 void m2() {
			System.out.println("Acc");
		}
}
class MyClass  extends A{
	
	 void m1() {
		System.out.println("B");
		
	}
	
public static void main(String[] args) {
	
	A a1=new MyClass();
	a1.m2();
	
	final Map<String,Integer> m=new HashMap<String,Integer>();
	
	//final List<String> l=new Arr

	String s="i am jagadeesh my self jagadeesh";
	
	String[] s1 =s.split(" ");
	
	Integer count=0;
	
	for (String string : s1) {
		
		if(m.containsKey(string)) {
			
			count =count+1;
			
			m.put(string, count);

		}
		else {
			m.put(string, count);
		}
		
		for (Map.Entry<String,Integer> entry : m.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			//System.out.println(key + " "+ val);
			
		}
		
	}
	
	
	
	

	
}
}
