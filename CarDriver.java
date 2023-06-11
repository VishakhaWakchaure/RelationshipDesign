package com.jsp.RelationshipDesign;

public class CarDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car c1=new Car("BMW","X5","White",500000000);
c1.printCarDetails();
System.out.println("*************************");
c1.setEngine(new Engine("335","2993"));
c1.printCarDetails();
	}

}
