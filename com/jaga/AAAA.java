package com.jaga;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AAAA {
public static void main(String[] args) {
	List<Integer> l=new ArrayList<Integer>();
	l.add(10);
	l.add(10);
	l.add(5);
	//l.stream().sorted((i1,i2)->i2.compareTo(i1).collect(Collectors.toList()).get(0));
	//System.out.println(l.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList()).get(0));
	//System.out.println(l.stream().mapToInt(i1->i1).max());
	//l.stream().mapToInt(i1->i1).max();
	l.stream().sorted().collect(Collectors.toSet()).forEach(i->System.out.println(i));

}
}
