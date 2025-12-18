package com.controller;

import java.util.Scanner;



import com.entities.Student;
import com.service.Studentservice;

public class StudentController {

	//public void insertData(Student s) throws Exception {
		//Studentservice ss = new Studentservice();
		//ss.insertData(s);
		//ss.getallrecord();
	//}

	public static void main(String[] args) throws Exception {

		//Scanner sc = new Scanner(System.in);

		//System.out.println("Enter ur ID here..!");
		//int id = sc.nextInt();
		//sc.nextLine();

		//System.out.println("Enter ur Name here..!");
		//String name = sc.nextLine();

		//System.out.println("Enter ur City here..!");
		//String city = sc.nextLine();

		//Student s = new Student(id, name, city);
		Studentservice ss = new Studentservice();
		//ss.insertData(s);
		ss.getallrecord();

	}

}