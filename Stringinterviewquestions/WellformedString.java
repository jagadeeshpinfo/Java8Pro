package Stringinterviewquestions;

import java.util.Stack;

public class WellformedString {
public static void main(String[] args) {
	String s="{()}";
	Stack<Character> stak=new Stack<Character>();
	for (int i = 0; i < s.length(); i++) {
		char ch=s.charAt(i);
		if(s.isEmpty())
			stak.push(ch);
		else if(ch =='{' || ch=='[' || ch=='(') 
			stak.push(ch);
		
		else if(ch== ']' && stak.peek()=='[')
			stak.pop();
		else if(ch=='}' && stak.peek()=='{')
			stak.pop();
		else if(ch == ')' && stak.peek() =='(')
			stak.pop();
	}
	if(stak.empty()) {
		System.out.println("well form");
	}else
		System.out.println("not well");
}
}
