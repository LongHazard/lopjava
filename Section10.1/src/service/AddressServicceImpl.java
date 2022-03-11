package service;

import java.util.Scanner;

import model1.Address;

public class AddressServicceImpl implements AddressServicce{

	@Override
	public void input(Address ad) {
		System.out.println("-----Nhap dia chi-----");
		System.out.println("Nhap id: "); ad.setId(new Scanner(System.in).nextInt());
		System.out.println("Nhap street: "); ad.setStreet(new Scanner(System.in).nextLine());
		System.out.println("Nhap city: "); ad.setCity(new Scanner(System.in).nextLine());
		
	}

	@Override
	public void info(Address ad) {
		System.out.println("DIA CHI");
		System.out.println("Id: " + ad.getId() + " Street: " + ad.getStreet() + " City: " + ad.getCity());
		
	}

}
