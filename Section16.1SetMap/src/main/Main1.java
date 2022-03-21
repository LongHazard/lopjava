package main;

import java.util.HashSet;
import java.util.Set;

import model.Person;
import service.SetExamService;
import service.SetExamServiceImpl;

public class Main1 {
	public static void main(String[] args) {
		SetExamService setExamService = new SetExamServiceImpl();
		Set<Person> set = setExamService.input();
		setExamService.info(set);
		setExamService.filter(set);
		setExamService.delete(set);
	}

}
