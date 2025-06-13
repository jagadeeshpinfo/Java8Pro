package com.corejava.immutable;

public class Addres {
private String city;
private String state;
private String country;
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public Addres(String city, String state,String country) {
	super();
	this.city = city;
	this.state = state;
	this.country = country;
}
//copy constructor
public Addres(Addres address) {
	 this(address.getCity(),address.getState(),address.getCountry());
}
//get instance
 static Addres getInstance(Addres address) {
	return new Addres(address.getCity(),address.getState(),address.getCountry());
}
@Override
public String toString() {
	return "Addres [city=" + city + ", state=" + state + ", country=" + country + "]";
}


}
