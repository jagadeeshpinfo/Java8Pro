package com.jaga;

import java.util.function.Predicate;

public class PredicateJoining {
public static void main(String[] args) {
	Predicate<String> checklenght=s->s.length()>=5;
	System.out.println(checklenght.test("jagadi"));
	Predicate<String> checkEvenLength  = s->s.length() % 2==0;
	System.out.println("even chek::"+checkEvenLength.test("jagadi"));
	System.out.println("after merging with and:"+checklenght.and(checkEvenLength).test("jagadi"));
	System.out.println("or condition::"+checklenght.or(checkEvenLength).test("jagadi"));
	System.out.println("or condition::"+checklenght.negate().test("jagadi"));

}
}
