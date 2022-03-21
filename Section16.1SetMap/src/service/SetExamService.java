package service;

import java.util.Set;

import model.Person;

public interface SetExamService {
	Set<Person> input();

	void info(Set<Person> setPersons);
	
	void filter(Set<Person> setPersons);
	
	void delete(Set<Person> setPersons);

}
