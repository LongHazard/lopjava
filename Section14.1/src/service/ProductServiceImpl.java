package service;

import java.util.Scanner;

import mode.Product;

public class ProductServiceImpl implements ProductService {

	@Override
	public void input(Product p) {
		System.out.println("Nhap id: ");
		p.setId(new Scanner(System.in).nextInt());
		System.out.println("Nhap Name: ");
		p.setName(new Scanner(System.in).nextLine());
		System.out.println("Nhap Price: ");
		p.setPrice(new Scanner(System.in).nextInt());

	}

	@Override
	public void info(Product p) {
		System.out.println("Id: " + p.getId());
		System.out.println("Name: " + p.getName());
		System.out.println("Price: " + p.getPrice());
	}

	@Override
	public Product[] inputList() {
		System.out.println("Nhap so product: ");
		int n = new Scanner(System.in).nextInt();
		Product[] pArr = new Product[n];
		for (int i = 0; i < pArr.length; i++) {
			pArr[i] = new Product();
			this.input(pArr[i]);
		}
		
		return pArr;
		
	}

	@Override
	public void infoList(Product[] pArr) {
		for (Product product : pArr) {
			this.info(product);
		}

	}

	

}
