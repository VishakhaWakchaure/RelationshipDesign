package com.jsp.RelationshipDesign;

public class Car {
private String name;
private String brand;
private String color;
private double price;
private Engine engine;
public Car(String name,String brand,String color,double price) {
	this.name=name;
	this.brand=brand;
	this.color=color;
	this.price=price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Engine getEngine() {
	return engine;
}
public void setEngine(Engine engine) {
	this.engine = engine;
}
public void printCarDetails() {
	System.out.println("Car Info:");
	System.out.println(name);
	System.out.println(brand);
	System.out.println(color);
	System.out.println(price);
	if(engine!=null) {
		System.out.println("Engine config");
		System.out.println(engine.getCubic_capacity());
		System.out.println(engine.getHorse_power());
	}else {
		System.out.println("Engine is not present");
	}
}
}
