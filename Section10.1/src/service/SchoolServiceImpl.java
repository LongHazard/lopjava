package service;

import java.util.Scanner;

import model1.School;

public class SchoolServiceImpl implements SchoolService{

	@Override
	public void input(School sc) {
		System.out.println("----Nhap thong tin truong----");
		System.out.println("Nhap id: "); sc.setId(new Scanner(System.in).nextInt());
		System.out.println("Nhap ten truong: "); sc.setName(new Scanner(System.in).nextLine());
		
		
	}

	@Override
	public void info(School sc) {
		System.out.println("THONG TIN TRUONG");
		System.out.println("Id truong: " + sc.getId() + "  Ten truong: " + sc.getName());
		
	}

}
