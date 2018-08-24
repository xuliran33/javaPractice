package com.xlr.animal;

public class Test {
	public static void main(String[] args) {
		Host host = new Host();
		Animal animal = host.sendAnimal("cat");
		animal.shout();
	}
}
