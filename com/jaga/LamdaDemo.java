package com.jaga;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class LamdaDemo extends PredicateDemo{
	
public static void main(String[] args) {
	BiConsumer<Integer, Integer> bc=(a,b)->System.out.println(a+b);
	bc.accept(10, 10);
	//Consumer<T>
	
}
}
 