package com.jaga;

import java.util.function.Predicate;

public class PredicateDemo {
public static void main(String[] args) {
	Predicate<String> checklenght=s->s.length()>=5;
	System.out.println(checklenght.test("jagad"));

}
}
