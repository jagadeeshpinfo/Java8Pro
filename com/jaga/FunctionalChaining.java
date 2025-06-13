package com.jaga;

import java.util.function.Function;

public class FunctionalChaining {
public static void main(String[] args) {
	Function<Integer, Integer> doubleit=i->2*i;
	Function<Integer, Integer> cube=i->i*i*i;
	System.out.println("first doubleit and then:"+doubleit.andThen(cube).apply(2));//2*2andthen4*4*4=64
	System.out.println("first cube and doubleit:"+doubleit.compose(cube).apply(2));//8*2=16
}
}
