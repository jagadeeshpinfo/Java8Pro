package com.jaga.scenario;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Java 8 map compute() method example.
 *
 * @version JavaProgramTo.com
 */
public class StringCountDuplicateCharJava8Compute {

    public static void main(String[] args) {
        printCountOfDuplicateCharMapCompute("bbbcccccddddddaaaax");
        printCountOfDuplicateCharMapCompute("##^$!%^$!^%@!$^@!kds");
        
        printCountOfDuplicateStingMapCompute("abc abc xyz,dsf");


    }

    // Using hashmap : print count of each character in a given string.
    private static void printCountOfDuplicateCharMapCompute(String input) {

        Map<Character, Integer> output = new HashMap<Character, Integer>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            output.compute(ch, (key, value) -> (value == null) ? 1 : value + 1);

        }

        System.out.println("==============================>"+output);

    }
    private static void printCountOfDuplicateStingMapCompute(String input) {

        Map<Character, Integer> output = new LinkedHashMap<Character, Integer>();
        String[] words=input.split(" ");
      // Map<String,Long>= .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
   	Map<String, Long> map=Arrays.asList(words).stream().
   			collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

       /*
		 * for (int i = 0; i < input.length(); i++) { // char ch = input.charAt(i);
		 * 
		 * 
		 * for() output.compute(words (key, value) -> (value == null) ? 1 : value + 1);
		 * 
		 * }
		 */
        
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>"+map);
        for (Map.Entry<String, Long> entry : map.entrySet()) {
			String key = entry.getKey();
			Long val = entry.getValue();
			
		}
        map.forEach((k,v)->System.out.println(k+" ---->"+v));
        
        Map<String , Long> map1 =  Arrays.stream(words)
                .collect(Collectors.groupingBy(c -> c , Collectors.counting()));
                map1.forEach( (k, v) -> System.out.println(k + " : "+ v)        );

    }

}

