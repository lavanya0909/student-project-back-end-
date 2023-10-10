package org.tmf.sms.services;

import java.util.Scanner;

import org.tmf.sms.entities.Student;

public class StudentServices extends StudentServicesTemplate{
	
	public void deleteStudentById() {
		// TODO Auto-generated method stub
		System.out.println("Delete function has called");
	}

	
	public void displayAllStudents() {
		// TODO Auto-generated method stub
		System.out.println("Display All students function has called");
		if(index==0) {
			System.out.println("No admission takes place.");
		}
		else {
			for(int i=0;i<index;i++) {
				System.out.println(students[i]);
			}
		}
	}


	@Override
	public void addStudent() {
		// TODO Auto-generated method stub
		System.out.println("Add New Student Function has called");
		
		if(index>=students.length) {
			System.out.println("Sorry!.. Admissions got closed...");
		}
		else {
			//Accepting data from the user
			System.out.println("Enter the Name of the student ");
			String name = scan.next();
			System.out.println("Enter the student Phone number ");
			long phone = scan.nextLong();
			
			//Create a student object then pass the data
			Student st = new Student();
			
			//Add the new student object to the array.
			students[index] = st;
			
			//Increase the Id and index after adding a new student.
			studentId++;
			index++;
		}

	}


	@Override
	public void displayStudentById() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void displayStudentByName() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void displayStudentByQualification() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void displayStudentByGender() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void displayStudentByDOB() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void validateStudent() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void updateStudentById() {
		// TODO Auto-generated method stub
		
	}
}