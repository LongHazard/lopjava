package service;

import java.util.Scanner;

import model.Dictionary;

public class DictionaryServiceImpl implements DictionaryService{

	@Override
	public void input(Dictionary dictionary) {
		System.out.println("Nhap key");
		dictionary.setKeyword(new Scanner(System.in).nextLine());
		System.out.println("Nhap description");
		dictionary.setDescription(new Scanner(System.in).nextLine());
		System.out.println("Nhap word_type");
		dictionary.setWord_type(new Scanner(System.in).nextLine());
		
	}

	@Override
	public void info(Dictionary dictionary) {
		System.out.println("Key: " + dictionary.getKeyword() + "Description: " + dictionary.getDescription() + "Word_type: " + dictionary.getWord_type());
		
		
	}

}
