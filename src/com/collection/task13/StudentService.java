package com.collection.task13;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
	Student s = new Student();
	List<Student> al = new LinkedList<>();
	Scanner sc = new Scanner(System.in);
	public List<Student> addStudent() {
		System.out.println("Enter number of students you want to add : ");
		int n = sc.nextInt();
		for(int i = 0; i<n ; i++) {
			System.out.println("Enter student id : ");
			int s_id = sc.nextInt();
			s.setId(s_id);
			System.out.println("Enter student Name : ");
			String s_name = sc.next();
			s.setName(s_name);
			System.out.println("Enter student age : ");
			int s_age = sc.nextInt();
			s.setAge(s_age);
			al.add(new Student(s.getId(), s.getName(), s.getAge()));
		}
		return al;
	}
}
