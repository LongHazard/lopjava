package service;

import java.util.Scanner;

import model.Person;

public class PersonServiceImpl implements PersonService {

	@Override
	public void input(Person p) {
		System.out.println("Nhap id: ");
		p.setId(new Scanner(System.in).nextInt());
		System.out.println("Nhap name: ");
		p.setName(new Scanner(System.in).nextLine());
		System.out.println("Nhap age: ");
		p.setAge(new Scanner(System.in).nextInt());

	}

	@Override
	public void info(Person p) {
		System.out.println("Id: " + p.getId() + " Name: " + p.getName() + " Age: " + p.getAge());
	}

}
