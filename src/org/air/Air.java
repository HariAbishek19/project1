package org.air;

public class Air {
public void aeroPlane() {
	System.out.println("aeroplane is a public transportation");
}
public void heliCopter() {
	System.out.println("helicopter is a private transportation");
}
public static void main(String[] args) {
	Air c =new Air();
	c.aeroPlane();
	c.heliCopter();
}
}
