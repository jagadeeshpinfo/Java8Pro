package Stringinterviewquestions;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String s1="aab";
	String s2="baa";
	System.out.println(isAnagram(s1,s2));
	System.out.println(usingArrasMethod(s1,s2));
}

private static boolean usingArrasMethod(String s1, String s2) {
	// TODO Auto-generated method stubs1
	boolean st=false;
	if(s1.length()!=s2.length())
		return false;
	else {
		
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		st=Arrays.equals(c1, c2);
		if(st)
			return true;
		else
		return false;
		
	}
	
}

private static boolean isAnagram(String s1, String s2) {
	int count[]=new int[256];
	if(s1.length()!=s2.length())
		return false;
	for (int i = 0; i < s1.length(); i++) {
		count[s1.charAt(i)]++;
		count[s2.charAt(i)]--;
		
	}
	for (int i = 0; i < count.length; i++) {
		if(count[i]!=0)
			return false;
	}
	return true;
}
}
