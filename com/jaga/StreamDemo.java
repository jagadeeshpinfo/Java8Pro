package com.jaga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StreamDemo {

	//static StreamDemo(){}
	//@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(22);
		al.add(1);
		al.add(20);

		System.out.println(al);//[22,1,20]
		
		ArrayList<Integer> newList=new ArrayList<Integer>();
		
		newList= (ArrayList<Integer>) al.stream().filter(i -> i>=15).collect(Collectors.toList());
		System.out.println("ssssssssssssssssss------"+newList);//[22,20]
		newList.stream().forEach(x->System.out.println(x));//22,20
		
		//useing map
		
		al.stream().map(x->x*x).collect(Collectors.toList()).forEach(x->System.out.println(x));//484,1,400
		//counting list data
		long fileredcount=al.stream().filter(i->i>=15).count();
		System.out.println("filtered count::"+fileredcount);//2
		
		//normal count
		System.out.println("normal count:"+ al.stream().count());//3
		//if we want to sort the elemnts in stream in sorted order
		Stream aa=al.stream().sorted();
		aa.forEach(x->System.out.println(x));//1,20,22
		//sort on filtered
		Stream s=al.stream().filter(x->x>=10).sorted();
		System.out.println("sorting on filtered list---->");
		s.forEach(x->System.out.println(x));//20,22
		
		//using coparator siorting on any stream filter/map/ or non filter/map
		Stream s1=al.stream().map(x->2*x).sorted((i1,i2)->i1.compareTo(i2));
		Long s2=al.stream().count();

		s1.forEach(x->System.out.println(x));//2,40,44
		
		// finding max , min val-min(comparator) will return min val based on the defined comparator
		int min=al.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("min val->"+min);//1
		int max =al.stream().max((i1,i2)->i1.compareTo(i2)).get();
		//int sum=al.stream().filter(i-).collect(null);
		System.out.println("max val->"+max);//22
		//min/max can perform on filter/map also
		System.out.println(al.stream().filter(i->i>=10).min((i1,i2)->i1.compareTo(i2)).get());//20
		
		//convert stream to arrayfor
		Object[] array=al.stream().toArray();
		for (Object object : array) {
			System.out.println("Array in elt  ->"+object);//22,1,20
			
		}
		Object[] array2=al.stream().filter(i->i>10).toArray();
		for (Object object : array2) {
			System.out.println("Array in elt after filter  ->"+object);//22,20
			
		}
		
		//printing duplicate names in a list
		String ss="I am jagadeesh";
		List<String> names11=Arrays.asList(ss.split(" "));
		System.out.println("names11**&&&_---------->"+names11);
		List<String> names= Arrays.asList("A","BB","CCC","A","CCC","E");
		HashSet<String> hs=new HashSet<String>();
	Set<String>	set=names.stream().filter(n->!hs.add(n)).collect(Collectors.toSet());
	System.err.println("hs="+hs);
	System.err.println("set="+set);
	System.out.println("printing duplicate names in a list   "+set);//[A,CCC]
	Map<String, Long> map=names.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println("printing duplicate names with their count in a list   "+map);//{BB=1, A=2, CCC=2, E=1}
	//simpaly way to find repeated data in list
	Set sss=map.entrySet().stream().filter(entry->entry.getValue()>1).map(entry->{entry.getValue();
		return entry.getKey();}).collect(Collectors.toSet());
	System.out.println("xxxx"+sss);//xxxx[A, CCC]
	//by simple way		
	Set x=names.stream().filter(name -> Collections.frequency(names, name)>1).collect(Collectors.toSet());
	System.out.println("YYYYY "+x);//YYYYY [A, CCC]
	//convert int array into list
		//Arrays.stream(a).boxed().collect(Collectors.toList());
	}
}
