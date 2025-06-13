package Stringinterviewquestions;

public class EvenlenthInstring {
public static void main(String[] args) {
	String str="hell world";
	int a=10;
	Integer b=10;
	Integer c= new Integer(10);
	Integer d= new Integer(10);

	System.out.println(a==c);
	
	for (String string : str.split(" ")) {
		if(string.length()%2==0)
			System.out.println(string);
		
	}
}
}
