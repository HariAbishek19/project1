package org.road;

public class Road {
public void bike() {
	System.out.println("bike is a two wheeler");

}
public void cycle() {
	System.out.println("cycle is a two wheeler");

}
public void car() {
	System.out.println("car is a four wheeler");

}
public void bus() {
	System.out.println("bus is a four wheeler");

}
public static void main(String[] args) {
	Road b=new Road();
	b.bike();
	b.cycle();
	b.car();
	b.bus();
}
}
