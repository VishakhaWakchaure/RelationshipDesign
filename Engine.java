package com.jsp.RelationshipDesign;

public class Engine {
private String horse_power;
private String cubic_capacity;

 public Engine(String horse_power, String cubic_capacity) {
	 this.horse_power=horse_power;
	 this.cubic_capacity=cubic_capacity;
 }

public String getHorse_power() {
	return horse_power;
}

public void setHorse_power(String horse_power) {
	this.horse_power = horse_power;
}

public String getCubic_capacity() {
	return cubic_capacity;
}

public void setCubic_capacity(String cubic_capacity) {
	this.cubic_capacity = cubic_capacity;
}
 
}
