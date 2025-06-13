package com.jaga;

import java.util.function.Function;

public class FunctionDemo {
public static void main(String[] args) {
	Function<Integer, Integer> f=i->i*i;
	System.out.println("square>"+f.apply(10));
}
}
