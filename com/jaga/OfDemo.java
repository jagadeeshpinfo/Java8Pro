package com.jaga;

import java.util.ArrayList;
import java.util.stream.Stream;

public class OfDemo {
	//stream concept not applicable just for collection,it's also applicable for any group vale
public static void main(String[] args) {
	Stream.of(1,22,33,4444,55555).forEach(i->System.out.println(i));
	String[] starray= {"A","B","C"};
	Stream.of(starray).forEach(i->System.out.println(i));
	ArrayList l=new ArrayList();
	l.add(1);
	l.add("A");
	System.out.println(l);
}
}
