package com.collection.task13;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;


public class StudentMain {	
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1,"Sai",23);
		Student s2  = new Student(2,"Vicky",24);
		Student s3 = new Student(3,"Kiran",25);
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		StudentService ss = new StudentService();
		
		
		System.out.println("Opeartion that can be performed by Admin : ");
		System.out.println("1. Add Student.");
		System.out.println("2. View Student.");
		System.out.println("3. Delete Student.");
		
		Scanner scan = new Scanner(System.in);
		int choose_option = scan.nextInt();
		List<Student> new_arr = new LinkedList<Student>();
		switch(choose_option) {
		case 1:				
			new_arr = ss.addStudent();
			al.addAll(new_arr);
			for(Student s : new_arr) {
				System.out.println(s.toString());
			}
			System.out.println("Student has been added");
			System.out.println();
		case 2:
			System.out.println("--------------------------------------------");
			System.out.println("View all the Students:");
			Vector v = new Vector();
			v.addAll(al);
			//System.out.println(v);
			Enumeration em = v.elements();
			while(em.hasMoreElements()) {
				System.out.println(em.nextElement());
			}
			break;
		case 3:
			System.out.println("List of Students: ");
			for(Student s : al) {
				System.out.println(s);
			}
			System.out.println("------------------------------------------");
			System.out.println("Enter the Student id to be deleted : ");
			int deleteStudent = scan.nextInt();
			Iterator<Student> iter = al.iterator();
			while(iter.hasNext()) {
				Student s = iter.next();
				if(s.getId()==deleteStudent) {
					iter.remove();
				}
			}
			System.out.println("--------------------------------------------------");
			System.out.println(" List of Students after deleting a Student :");
			for(Student s : al) {
				System.out.println(s);
			}
			break;
	}
	scan.close();
}
}
