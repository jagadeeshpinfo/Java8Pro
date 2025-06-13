package com.corejava.immutable;

public class Std {
private final int id;
private final String name;
private final Addres address;
public int getId() {
	return id;
}

public String getName() {
	return name;
}


//copy construcotr used
public Addres getAddress() {
	return  Addres.getInstance(address); 
}

public Std(int id, String name,Addres address) {
	super();
	this.id = id;
	this.name = name;
	this.address=address;
}

@Override
public String toString() {
	return "Std [id=" + id + ", address=" + address + ", name=" + name + "]";
}



}
