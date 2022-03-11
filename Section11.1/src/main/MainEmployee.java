package main;

import model.Employee;

public class MainEmployee {
	public static void main(String[] args) {

		Employee emp = new Employee() {
			public void salary() {
				System.out.println("luong 10 trieu");
			};
		};
		emp.salary();
	}
}
