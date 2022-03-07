package main;

import model.Nation;
import model.Person;

public class MainNation {
	public static void main(String[] args) {
		Nation nc = new Nation();
		nc.input();
		
		Person[] personArr = new Person[3];
		for (int i = 0; i < personArr.length; i++) {
			personArr[i] = new Person();
			personArr[i].input();
		}
		
		for (Person person : personArr) {
			person.info();
		}
	}

}
