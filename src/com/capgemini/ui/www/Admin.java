package com.capgemini.ui.www;

import java.util.Scanner;

import com.capgemini.bl.www.StudentSchedular;

public class Admin {
	
private static Scanner sc = new Scanner(System.in);
private static StudentSchedular stdSch = new StudentSchedular();

	public static void main(String[] args) {
		//System.out.println("Good Luck");
		showMenu();

	}

	private static void showMenu() {
		int choice;
		while(true){
		System.out.println("Choose one of the below options: ");
		System.out.println("1) Enter Student Details");
		System.out.println("2) Show Details");
		System.out.println("3) Search details");
		System.out.println("4) Exit");
		choice = sc.nextInt();
		
		
			switch(choice){
			case 1: addStudentDetails();
			break;
			case 2: showDetails();
			break;
			case 3: searchDetails();
			break;
			case 4: System.exit(0);
			break;
			default:System.exit(0);
			break;
				
			}
		}
		
		
	}
	private static void addStudentDetails() {
		System.out.println("Enter  Roll Number");
		int rollNumber = sc.nextInt();
		Boolean flag = checkRollNumber(rollNumber);
		if(flag){
			System.out.println("Enter Name");
			String name = sc.next();
			
			System.out.println("Enter number of courses you want to enroll for");
			int noOfCourse = sc.nextInt();
			String[] courseName = new String[noOfCourse];
			for(int i=0;i<noOfCourse;i++){
				System.out.println("Entery number "+i+1);
				courseName[i] = sc.next();
			}
			System.out.println(stdSch.addStudent(rollNumber, name, courseName));
		}else{
			System.out.println("Roll Number Already Present");
		}
		
	}
	private static void showDetails() {
		stdSch.showStudentList();
		
	}
private static void searchDetails(){
	System.out.println("Enter  Roll Number to search details for");
	int searchRollNumber = sc.nextInt();
	stdSch.searchDetails(searchRollNumber);
}
private static Boolean checkRollNumber(int rollNumber) {
	return stdSch.checkRollNumber(rollNumber);
	
}

}
