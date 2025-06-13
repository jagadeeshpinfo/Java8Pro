package Stringinterviewquestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrstNonRepeatedCharinStr {
public static void main(String[] args) {
	
	String s="aaaabbfcckkd";
	char c=firstNonRepeatChar(s);
	System.out.println(c);
}

private static char firstNonRepeatChar(String s) {
	// TODO Auto-generated method stub
	Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
	char c = 0;
	for(char ch:s.toCharArray()) {
		
		map.put(ch, map.containsKey(ch)?map.get(ch)+1:1);
		
	}
	System.out.println(map);
	for (Map.Entry<Character, Integer> entry : map.entrySet()) {
		/*
		 * Character key = entry.getKey(); Integer val =
		 */ 
				if(entry.getValue() ==1) {
					 c= entry.getKey();
					break;
				}
		
	}
	return c;
}
}
