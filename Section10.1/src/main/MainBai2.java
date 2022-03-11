package main;

import model1.Laptop;
import service.LaptopService;
import service.LaptopServiceImpl;

public class MainBai2 {
	public static void main(String[] args) {
		Laptop lt = new Laptop();
		
		LaptopService laptopService = new LaptopServiceImpl();
		laptopService.input(lt);
		laptopService.info(lt);

	}
}
