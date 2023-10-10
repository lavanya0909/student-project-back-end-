package org.tmf.sms.services;

import java.util.Scanner;

import org.tmf.sms.entities.Student;

public abstract class StudentServicesTemplate {
		protected Student students[] = new Student[10];
		protected long studentId=10000002;
		protected int index = 0;
	  Scanner scan = new Scanner(System.in);
      //Abstract methods.
	  abstract public void addStudent();
      public abstract void displayAllStudents();
      public abstract void displayStudentById();
      public abstract void displayStudentByName();
      public abstract void displayStudentByQualification();
      public abstract void displayStudentByGender();
      public abstract void displayStudentByDOB();
      public abstract void validateStudent();
      public abstract void updateStudentById();
      protected abstract void deleteStudentById();
      
      //Normal Function.
      public void menu() {
    	  while(true) {
    			System.out.println("================================================");
    			System.out.println("*****Student Monitoring System***");
    			System.out.println("================================================");
    			System.out.println("Press 1 for Add new Student");
    			System.out.println("Press 2 for Display all available students");
    			System.out.println("Press 3 for Display student by ID");
    			System.out.println("Press 4 for Display student by Name");
    			System.out.println("Press 5 for Display student by Gender");
    			System.out.println("Press 6 for Display student by Qualification");
    			System.out.println("Press 7 for Display student by Date Of Birth");
    			System.out.println("Press 8 for Validate Student");
    			System.out.println("Press 9 for Update Student Details");
    			System.out.println("Press 10 for Delete Student by Id");
    			System.out.println("Press 11 for Exit");
    			System.out.println("Please Enter your Choice....");
    			int option = scan.nextInt();
    			
    			switch(option) {
    			case 1 : addStudent();break;
    			case 2 : displayAllStudents();break;
    			case 3 : displayStudentById();break;
    			case 9 : updateStudentById();break;
    			case 10 : deleteStudentById();break;
    			case 11 : System.exit(0);
    			case 4 : displayStudentByName();break;
    			case 5 : displayStudentByGender();break;
    			case 6 : displayStudentByQualification();break;
    			case 7 : displayStudentByDOB();break;
    			case 8 : validateStudent();break;
    			default : System.out.println("Please choose a correct options");
    			}
    			}
      }
}