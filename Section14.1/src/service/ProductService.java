package service;

import mode.Product;

public interface ProductService {
	void input(Product p);

	void info(Product p);

	Product[] inputList();

	void infoList(Product[] pArr);
}
