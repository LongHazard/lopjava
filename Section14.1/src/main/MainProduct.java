package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import mode.Product;
import service.ProductService;
import service.ProductServiceImpl;

public class MainProduct {
	public static void main(String[] args) {
		Product p = new Product();
		ProductService productService = new ProductServiceImpl();
		productService.input(p);
		productService.info(p);
		writeFile(p);
		readFile();

	}

	public static void writeFile(Product p) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("product.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(p);
			objectOutputStream.close();
			fileOutputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void readFile() {
		File file = new File("product.txt");
		if (file.exists()) {
			try {
				FileInputStream fileInputStream = new FileInputStream(file);
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
				Product p = (Product) objectInputStream.readObject();
				System.out.println(p.getId() + " " + p.getName() + " " + p.getPrice());
				objectInputStream.close();
				fileInputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
