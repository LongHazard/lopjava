package model;

import java.util.Scanner;

public class House {
	private String address;
	private Person owner;
	
	public void input() {
		System.out.println("Address: ");
		address = new Scanner(System.in).nextLine();
		
	}
	
	public void info() {
		System.out.println(address);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}


}
