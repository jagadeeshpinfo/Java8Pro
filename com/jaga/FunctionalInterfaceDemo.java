package com.jaga;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
void singleAbsMethod();
default void m1() {
	System.out.println("m1");
}
}
