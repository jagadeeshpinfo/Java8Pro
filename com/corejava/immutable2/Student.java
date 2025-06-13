package com.corejava.immutable2;

import java.util.Objects;
//immutable class
public class Student {
final private String name;

public String getName() {
	return name;
}



public Student(String name) {
	super();
	this.name = name;
}

@Override
public int hashCode() {
	return Objects.hash(name);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return Objects.equals(name, other.name);
}

}
