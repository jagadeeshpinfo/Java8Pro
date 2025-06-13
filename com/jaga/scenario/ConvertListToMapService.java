package com.jaga.scenario;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ConvertListToMapService {
	/*
	 * public Map < Long, Employee1 > convertListBeforeJava8(List < Employee1 >
	 * list) {
	 * 
	 * Map < Long, Employee1 > map = new HashMap < > ();
	 * 
	 * for (Employee1 animal: list) { map.put(animal.getId(), animal); } return map;
	 * }
	 */

    public Map < Long, Employee1 > convertListAfterJava8(List < Employee1 > list) {
    	
    	//System.out.println(list.stream().collect(Collectors.toMap(Employee1::getId, e->e)));
        Map < Long, Employee1 > map = list.stream().collect(Collectors.toMap(Employee1::getId, e -> e, (e1, e2) -> e2, LinkedHashMap::new ));
      //  Map < Long, Employee1 > map = list.stream().collect(Collectors.toMap(Employee1::getId, e -> e));

        return map;
    }

    public static void main(String[] args) {

        ConvertListToMapService convertListToMapService = new ConvertListToMapService();
        List < Employee1 > list = new ArrayList < > ();
        list.add(new Employee1(100L, "Ramesh"));
        list.add(new Employee1(101L, "Tom"));
        list.add(new Employee1(105L, "Tom"));

        list.add(new Employee1(102L, "Tony"));

      //  Map < Long, Employee1 > map = convertListToMapService.convertListBeforeJava8(list);
        //System.out.println(map);

       Map < Long, Employee1 > map1 = convertListToMapService.convertListAfterJava8(list);
        System.out.println(map1);
        
        String s="java ibm";
        List<String> cl=Arrays.asList(s.split(" "));
        System.out.println("DDDDDDDDD"+cl.stream().count());
        char[] a=s.toCharArray();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) != ' ')    
                count++;    
		}
        System.out.println(count);
		long l=s.chars().filter(c-> c!=' ').count();
		System.out.println(l);
        //List l= 
        		Arrays.asList(a).stream().collect(Collectors.toList()).forEach(x->System.out.println(x));
       // System.out.println(l.size());
    }
}

class Employee1 {

    private Long id;
    private String name;

    public Employee1(Long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + "]";
	}
    
}