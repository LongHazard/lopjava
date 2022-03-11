package service;

import java.util.Scanner;

import model1.Laptop;

public class LaptopServiceImpl implements LaptopService {

	@Override
	public void input(Laptop lt) {
		System.out.println("Nhap id:");
		lt.setId(new Scanner(System.in).nextInt());
		System.out.println("Nhap cpu:");
		lt.setCpu(new Scanner(System.in).nextLine());
		System.out.println("Nhap ram:");
		lt.setRam(new Scanner(System.in).nextLine());
		System.out.println("Nhap vga:");
		lt.setVga(new Scanner(System.in).nextLine());

	}

	@Override
	public void info(Laptop lt) {
		System.out.println("Id: " + lt.getId());
		System.out.println("Cpu: " + lt.getCpu());
		System.out.println("Ram: " + lt.getRam());
		System.out.println("Vga: " + lt.getVga());

	}

}
