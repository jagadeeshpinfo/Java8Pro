package com.jaga.scenario;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmpBasedSal {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<Employee> emplist=new ArrayList<Employee>();
		emplist.add(new Employee(1,500));
		emplist.add(new Employee(2,1000));
		emplist.add(new Employee(3,1500));
		emplist.add(new Employee(4,2000));
		emplist.add(new Employee(5,2500)); 
		emplist.add(new Employee(6,3000));
		emplist.add(new Employee(7,3500));
		String res = emplist.stream()
                .map(Object::toString)
                .collect(Collectors.joining("**"));
		System.out.println("res:"+res);
		
				List slist =
		emplist.stream().sorted((e1,e2)->(int)(e1.getSalary()-e2.getSalary())).skip(4).collect(Collectors.toList());
		System.out.println("======"+slist);
		slist.forEach(x->System.out.println(x));

		List<Emp> elist=new ArrayList<Emp>();
		elist.add(new Emp(1,"A",30));
		elist.add(new Emp(1,"B",35));
		elist.add(new Emp(1,"C",32));
		elist.add(new Emp(1," ",28));
		elist.add(new Emp(1,"C",25));
		//based name sorting
		//List<Emp> sss=elist.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).collect(Collectors.toList());

		List<Integer> l= elist.stream().map(e->e.getAge()).collect(Collectors.toList());
		IntSummaryStatistics  is= l.stream().mapToInt(i->i).summaryStatistics();
		System.out.println(is.getSum());
		//operator
		//int s=integerList.stream().reduce((a1,a2)->a1+a2).get();
		//System.out.println("sum-->"+s);
		List<String> lnames=elist.stream().map(e->e.getName()).collect(Collectors.toList());
		String names=lnames.stream().map(name->name.toLowerCase()).collect(Collectors.joining(","));
		System.out.println(names);
	}

}
