package service;

import java.util.Scanner;

import model1.Address;
import model1.School;
import model1.Student;

public class StudentServiceImpl implements StudentService {

	@Override
	public void input(Student st) {
		System.out.println("------Nhap thong tin student------");
		System.out.println("Nhap id: ");
		st.setId(new Scanner(System.in).nextInt());
		System.out.println("Nhap name: ");
		st.setName(new Scanner(System.in).nextLine());
		System.out.println("Nhap age: ");
		st.setAge(new Scanner(System.in).nextInt());

		School sc = new School();
		SchoolService schoolService = new SchoolServiceImpl();
		schoolService.input(sc);
		st.setSchool(sc);

		Address ad = new Address();
		AddressServicce addressServicce = new AddressServicceImpl();
		addressServicce.input(ad);
		st.setAddress(ad);

	}

	@Override
	public void info(Student st) {
		System.out.println("THONG TIN SING VIEN");
		System.out.println("ID: " + st.getId() + " Name: " + st.getName() + " Age: " + st.getAge());
		if (st.getSchool() != null) {
			SchoolService schoolService = new SchoolServiceImpl();
			schoolService.info(st.getSchool());
		}

		if (st.getAddress() != null) {
			AddressServicce addressServicce = new AddressServicceImpl();
			addressServicce.info(st.getAddress());
		}

	}

}
