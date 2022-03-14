package main;

import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		int x = input();
		int y = input();
		int tong = x+y;
		System.out.println("Tong: " + tong);
	}

	public static int input() {
		while (true) {
			try {
				System.out.println("Nhap so: ");
				return new Scanner(System.in).nextInt();

			} catch (Exception e) {
				System.out.println("Nhap sai nhap lai");
			}
		}
	}
}
