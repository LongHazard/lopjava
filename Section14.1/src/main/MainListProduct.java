package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import mode.Product;
import service.ProductService;
import service.ProductServiceImpl;

public class MainListProduct {
	public static void main(String[] args) {
 		writeFile();
 		readFile();
		
	}
	
	public static void writeFile() {
		ProductService productService = new ProductServiceImpl();
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("prolist.txt");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			Product[] products = productService.inputList();
			objectOutputStream.writeObject(products);
			objectOutputStream.close();
			fileOutputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void readFile() {
		ProductService productService = new ProductServiceImpl();
		File file = new File("prolist.txt");
		if (file.exists()) {
			try {
				FileInputStream fileInputStream = new FileInputStream(file);
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
				Product[] products = (Product[]) objectInputStream.readObject();
				productService.infoList(products);
				
				objectInputStream.close();
				fileInputStream.close();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("ko co tep");
			}
		}
	}

}
