package main;

import java.util.ArrayList;
import java.util.List;

import model.Person;
import service.ListExamService;
import service.ListExamServiceImpl;

public class MainList {
	public static void main(String[] args) {
		ListExamService listExamService = new ListExamServiceImpl();
		List<Person> list = listExamService.input();

		listExamService.info(list);
		listExamService.filter(list);
		listExamService.delete(list);
		listExamService.sortPerson(list);

	}

}
