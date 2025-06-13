package Stringinterviewquestions;

import java.util.Iterator;

public class NumOfWordsInString {

	public static void main(String[] args) {
		String s="Ggg hhhlll lllk";
	int c=	wordCount(s);
	System.out.println(c);
	}

	private static int wordCount(String s) {
		// TODO Auto-generated method stubint count=
		
		int count=0;
		
		if(s.charAt(0)!=' ')
			count++;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ' && s.charAt(i+1) !=' ')
				count++;
		}
		return count;
		
		
	}
}
