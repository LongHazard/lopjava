package main;

import java.util.Scanner;

import model.Animal;
import model.Chicken;
import model.Dog;

public class MainAnimal {
	public static void main(String[] args) {
//		Animal a = new Dog();
//		input(a);
//		info(a);
		menu();

	}

	public static void input(Animal a) {
		System.out.println("Name: ");
		a.setName(new Scanner(System.in).nextLine());
		System.out.println("id: ");
		a.setId(new Scanner(System.in).nextInt());
		if (a instanceof Dog) {
			Dog d = (Dog) a;
			System.out.println("Color: ");
			d.setColor(new Scanner(System.in).nextLine());
		}
		if (a instanceof Chicken) {
			Chicken c = (Chicken) a;
			System.out.println("Sex: ");
			c.setSex(new Scanner(System.in).nextLine());
		}
	}

	public static void info(Animal a) {
		System.out.println("INFO: ");
		System.out.println("Name: " + a.getName());
		System.out.println("Id: " + a.getId());
		if (a instanceof Dog) {
			Dog d = (Dog) a;
			System.out.println("Color: " + d.getColor());
		}
		if (a instanceof Chicken) {
			Chicken c = (Chicken) a;
			System.out.println("Sex: " + c.getSex());
		}
	}

	public static void menu() {
		while (true) {
			System.out.println("1. DOG");
			System.out.println("2. CHECKEN");
			System.out.println("VUI LONG CHON");
			int sc = new Scanner(System.in).nextInt();
			if (sc == 1) {
				System.out.println("Nhap so luong: ");
				int n = new Scanner(System.in).nextInt();
				Dog[] dogs = new Dog[n];

				for (int i = 0; i < dogs.length; i++) {
					dogs[i] = new Dog();
					input(dogs[i]);
				}

				for (Dog dog : dogs) {
					info(dog);
					System.out.println("---------");
				}
				break;
			} else if (sc == 2) {
				System.out.println("Nhap so luong: ");
				int n = new Scanner(System.in).nextInt();
				Chicken[] chickens = new Chicken[n];

				for (int i = 0; i < chickens.length; i++) {
					chickens[i] = new Chicken();
					input(chickens[i]);
				}

				for (Chicken chicken : chickens) {
					info(chicken);
					System.out.println("---------");
				}
				break;
			} else {
				System.out.println("Vui long chon lai;");
			}
		}
	}

}
