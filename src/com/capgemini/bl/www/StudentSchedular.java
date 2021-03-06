package com.capgemini.bl.www;

import com.capgemini.model.www.Student;

public class StudentSchedular {
private Student[] stds = new Student[10];
private int counter;

public String addStudent(int rollNo, String name, String[] courseName){
	
		stds[counter++] = new Student(rollNo, name,courseName);
		return "Added";
	
	
}
public Boolean checkRollNumber(int rollNumber){
	boolean present = false;
	for(int i=0;i<counter;i++){
		if(stds[i].getRollNumber()==rollNumber){
			present = true;
		}
	}
	if(!present){
		//stds[counter++] = new Student(rollNo, name,courseName);
		present = false;
		return true;
	}else{
		return false;
	}
}
public void showStudentList(){
	for(int i=0;i<counter;i++){
		System.out.println(stds[i].getRollNumber());
		System.out.println(stds[i].getName());
		
		for(int j=0;j<stds[i].getCourseName().length;j++){
			System.out.println(stds[i].getCourseName()[j]);
		}
	}
	
}
public void searchDetails(int searchRollNumber){
	for(int i=0;i<counter;i++){
		if(stds[i].getRollNumber()==searchRollNumber){
			System.out.println(stds[i].getRollNumber());
			System.out.println(stds[i].getName());
			for(int j=0;j<stds[i].getCourseName().length;j++){
				System.out.println(stds[i].getCourseName()[j]);
			}
		}
	}
}
}
