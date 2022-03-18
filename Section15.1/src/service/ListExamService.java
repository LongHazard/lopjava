package service;

import java.util.List;

import model.Person;

public interface ListExamService {
	List<Person> input();

	void info(List<Person> lisPersons);

	void filter(List<Person> lisPersons);

	void delete(List<Person> lisPersons);

	void sortPerson(List<Person> liPersons);

}
