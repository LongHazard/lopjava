package main;

import model.Car;
import model.House;
import model.Person;

public class MainPerson {
	public static void main(String[] args) {
		Person person = new Person();
		person.input();
		
		House[] houseArr = new House[2];
		System.out.println("INPUT");
		for (int i = 0; i < houseArr.length; i++) {
			houseArr[i] = new House();
			houseArr[i].input();
			houseArr[i].setOwner(person);
		}
		
		Car[] carArr = new Car[2];
		for (int i = 0; i < carArr.length; i++) {
			carArr[i] = new Car();
			carArr[i].input();
			carArr[i].setOwner(person);
		}
		
		System.out.println("INFO");	
		for (int i = 0; i < houseArr.length; i++) {
			houseArr[i].info();
			houseArr[i].getOwner().info();
		}
		System.out.println("------------");
		for (int i = 0; i < carArr.length; i++) {
			carArr[i].info();
			carArr[i].getOwner().info();
		}
		
		
		
		
	}

}
