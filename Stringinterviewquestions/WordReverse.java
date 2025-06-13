package Stringinterviewquestions;

public class WordReverse {
public static void main(String[] args) {
	String s="Hello World";
	String[] sarray=s.split(" ");
	for (int  i = sarray.length-1;i>=0; i--) {
		System.out.println(sarray[i]);
	}
}
}
