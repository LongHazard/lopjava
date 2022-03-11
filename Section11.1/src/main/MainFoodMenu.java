package main;

import enumjava.FoodMenu;

public class MainFoodMenu {
	public static void main(String[] args) {
		FoodMenu[] foodMenus = FoodMenu.values();

		for (int i = 0; i < foodMenus.length; i++) {
			System.out.println(foodMenus[i].getId());
			System.out.println(foodMenus[i].getTen());
		}
	}

}
