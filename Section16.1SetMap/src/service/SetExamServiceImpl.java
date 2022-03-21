package service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import model.Person;

public class SetExamServiceImpl implements SetExamService{
	PersonService personService = new PersonServiceImpl();

	@Override
	public Set<Person> input() {
		Set<Person> setPersons = new HashSet<Person>();
		while (true) {
			Person p = new Person();
			personService.input(p);
			setPersons.add(p);
			System.out.println("Them Person nua hong");
			String s = new  Scanner(System.in).nextLine();
			if(s.equalsIgnoreCase("N")) {
				break;
			}
		}
		
		return setPersons;
	}

	@Override
	public void info(Set<Person> setPersons) {
		for (Person person : setPersons) {
			personService.info(person);
		}
		
	}

	@Override
	public void filter(Set<Person> setPersons) {
		for (Person person : setPersons) {
			if(person.getAge() < 20)
				personService.info(person);
		}
		
	}

	@Override
	public void delete(Set<Person> setPersons) {
		Iterator<Person> itr = setPersons.iterator();
		while(itr.hasNext()) {
			Person p = itr.next();
			if (p.getName().contains("A"))
				itr.remove();
		}
		
		for (Person person : setPersons) {
			personService.info(person);
		}
		
	}

}
