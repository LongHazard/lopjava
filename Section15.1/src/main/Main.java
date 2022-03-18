package main;

import model.Person;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person(3, "Long", 20);
		Person p2 = new Person(1, "Long", 20);
		
		System.out.println(p1.equals(p2));

	}

}
