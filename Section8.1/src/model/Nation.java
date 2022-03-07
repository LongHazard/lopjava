package model;

import java.util.Scanner;

public class Nation {
	private String nameNation;
	private Person[] persons;
	
	public void input() {
		System.out.println("NameNation: ");
		nameNation = new Scanner(System.in).nextLine();
		
	}
	
	public void info() {
		System.out.println(nameNation);
	}
	
	public String getNameNation() {
		return nameNation;
	}
	public void setNameNation(String nameNation) {
		this.nameNation = nameNation;
	}
	public Person[] getPersons() {
		return persons;
	}
	public void setPersons(Person[] persons) {
		this.persons = persons;
	}
	
	
	

}
