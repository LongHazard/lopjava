package model;

import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	private House[] house;
	private Car[] car;
	
	
	public void input() {
		System.out.println("Name: ");
		name = new Scanner(System.in).nextLine();
		
		System.out.println("Age: ");
		age = new Scanner(System.in).nextInt();
	}
	
	public void info() {
		System.out.println(age);
		System.out.println(name);
	} 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public House[] getHouse() {
		return house;
	}
	public void setHouse(House[] house) {
		this.house = house;
	}
	public Car[] getCar() {
		return car;
	}
	public void setCar(Car[] car) {
		this.car = car;
	}
	
	
			
	
	

}
