package main;

import java.util.Scanner;

import model.Car;
import model.Chicken;
import model.Dog;
import model.Train;
import model.Transport;

public class MainTransport {
	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		while (true) {
			System.out.println("1. TRAIN");
			System.out.println("2. CAR");
			System.out.println("---VUI LONG CHON---");
			int sc = new Scanner(System.in).nextInt();
			if (sc == 1) {
				Transport tr = new Train(0, 0);
				input(tr);
				info(tr);
				break;

			} else if (sc == 2) {
				Transport tr = new Car(0, 0);
				break;

			} else {
				System.out.println("Vui long chon lai;");
			}
		}
	}

	public static void input(Transport tr) {
		System.out.println("Xin vui long nhap gia ve: ");
		tr.setGiaVe(new Scanner(System.in).nextFloat());
		System.out.println("Xin vui long nhap so ghe: ");
		tr.setSoGhe(new Scanner(System.in).nextInt());
		if (tr instanceof Train) {
			Train train = (Train) tr;
			System.out.println("Xin vui long nhap so toa: ");
			train.setSoToa(new Scanner(System.in).nextInt());
		}
		if (tr instanceof Car) {
			Car c = (Car) tr;
			System.out.println("Xin vui long nhap loai xe: ");
			c.setLoaiXe(new Scanner(System.in).nextLine());
		}
	}

	public static void info(Transport tr) {
		System.out.println("THONG TIN HANG XE: ");
		System.out.println("Gia ve: " + tr.getGiaVe());
		System.out.println("So ghe: " + tr.getSoGhe());
		if (tr instanceof Train) {
			Train train = (Train) tr;
			System.out.println("So toa: " + train.getSoToa());
		}
		if (tr instanceof Car) {
			Car c = (Car) tr;
			System.out.println("Loai xe: " + c.getLoaiXe());
		}
	}

}
