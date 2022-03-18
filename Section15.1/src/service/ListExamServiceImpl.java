package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import model.Person;

public class ListExamServiceImpl implements ListExamService {
	PersonService personService = new PersonServiceImpl();

	@Override
	public List<Person> input() {
		List<Person> listPersons = new ArrayList<Person>();
		while (true) {
			Person p = new Person();
			personService.input(p);
			listPersons.add(p);
			System.out.println("Them nua ko ?");
			String s = new Scanner(System.in).nextLine();
			if (s.equalsIgnoreCase("N")) {
				break;
			}
		}
		return listPersons;
	}

	@Override
	public void info(List<Person> lisPersons) {
		System.out.println("THONG TIN PERSON");
		for (int i = 0; i < lisPersons.size(); i++) {
			personService.info(lisPersons.get(i));

		}

//		for (Person person : lisPersons) {
//			personService.info(person);
//		}

	}

	@Override
	public void filter(List<Person> lisPersons) {
		System.out.println("Person tuoi < 20");
		for (int i = 0; i < lisPersons.size(); i++) {
			if (lisPersons.get(i).getAge() < 20) {
				personService.info(lisPersons.get(i));
			}

		}

	}

	@Override
	public void delete(List<Person> lisPersons) {
		Iterator<Person> itr = lisPersons.iterator();
		while (itr.hasNext()) {
			Person p = itr.next();
			if (p.getName().contains("A"))
				itr.remove();
		}

		for (Person person : lisPersons) {
			personService.info(person);
		}
	}

	@Override
	public void sortPerson(List<Person> lisPersons) {
		Collections.sort(lisPersons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {

				return o1.getAge() - o2.getAge();
			}

		});
		
		System.out.println("Tang dan theo tuoi");
		for (Person person : lisPersons) {
			personService.info(person);
		}
		
		System.out.println("-----------");
		
		Collections.sort(lisPersons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {

				return o2.getAge() - o1.getAge();
			}

		});
		
		System.out.println("Giam dan theo tuoi");
		for (Person person : lisPersons) {
			personService.info(person);
		}

	}

}
