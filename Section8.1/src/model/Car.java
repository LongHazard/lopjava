package model;

import java.util.Scanner;

public class Car {
	private String model;
	private int price;
	private Person owner;
	
	public void input() {
		System.out.println("Model: ");
		model = new Scanner(System.in).nextLine();
		
		System.out.println("Price: ");
		price = new Scanner(System.in).nextInt();
	}
	
	public void info() {
		System.out.println(model);
		System.out.println(price);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}
	
	

}
