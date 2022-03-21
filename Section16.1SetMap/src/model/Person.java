package model;

public class Person {
	private int id;
	private String name;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p1 = (Person) obj;
			if (p1.getAge() == this.id)
				return true;
		}
		return false;

//		return (obj instanceof Person) ? (((Person) obj).getId() == this.id) : false;
	}

	@Override
	public int hashCode() {
		return this.id;
	}

}
