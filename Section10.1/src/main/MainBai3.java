package main;

import java.util.Scanner;

import model1.Student;
import service.StudentService;
import service.StudentServiceImpl;

public class MainBai3 {
	public static void main(String[] args) {
//		Student st = new Student();
//		StudentService studentService = new StudentServiceImpl();
//		studentService.input(st);
//		studentService.info(st);

		System.out.println("Nhap so luong student: ");
		int n = new Scanner(System.in).nextInt();
		Student[] students = new Student[n];
		StudentService studentService = new StudentServiceImpl();

		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
			studentService.input(students[i]);
		}

//		for (Student student : students) {
//			studentService.info(student);
//		}

		System.out.println("In ra sinh vien co tuoi lon nhat");
		Student max = students[0];
		for (int i = 0; i < students.length; i++) {
			if (students[i].getAge() > max.getAge()) {
				max = students[i];
				studentService.info(students[i]);
			}
		}

	}
}
