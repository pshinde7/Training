package com.spr.studentmanagement;

import java.util.Scanner;

import com.spr.student.Student;

public class StudentManagament {

	public static void main(String[] args) {
		int firstYearStudentCount ;
		int secondYearStudentCount;
		int thirdYearStudentCount;
		int fourthYearStudentCount;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter no of student in first year : ");
		firstYearStudentCount = scan.nextInt();
		
		System.out.println("Enter no of student in second year : ");
		secondYearStudentCount = scan.nextInt();
		
		System.out.println("Enter no of student in third year : ");
		thirdYearStudentCount = scan.nextInt();
		

		System.out.println("Enter no of student in fourth year : ");
		fourthYearStudentCount = scan.nextInt();
		
		System.out.println("Enter first year student details  \n");
		Student [] allFirstYearStudent = new Student[firstYearStudentCount];
		getStudentDetails(scan, allFirstYearStudent);
		
		System.out.println("Enter second year student details  \n");
		Student [] allSeconfYearStudent = new Student[secondYearStudentCount];
		getStudentDetails(scan, allSeconfYearStudent);
		
		System.out.println("Enter third year student details  \n");
		Student [] allthirdfYearStudent = new Student[thirdYearStudentCount];
		getStudentDetails(scan, allthirdfYearStudent);
		
		System.out.println("Enter Fourth year student details  \n");
		Student [] allFourthYearStudent = new Student[fourthYearStudentCount];
		getStudentDetails(scan, allFourthYearStudent);
		
		System.out.println("Average for first year student is : "+caluclateAvg(allFirstYearStudent)+" %");
		
		System.out.println("Average for second year student is : "+caluclateAvg(allSeconfYearStudent)+" %");

		System.out.println("Average for third year student is : "+caluclateAvg(allthirdfYearStudent)+" %");

		System.out.println("Average for fourth year student is : "+caluclateAvg(allFourthYearStudent)+" %");

	}

	private static double caluclateAvg(Student[] allStudent) {
		double totalPer=0 ;
		for(Student s : allStudent){
			totalPer = totalPer +s.getAvg();
		}
		return totalPer;
	}

	private static void getStudentDetails(Scanner scan, Student[] allStudent) {
		for (int eachstudent = 0; eachstudent < allStudent.length; eachstudent++) {
			Student student = new Student();
			System.out.println("Enter student name : ");
			student.setStudentName(scan.next());
			
			System.out.println("Enter student roll no : ");
			student.setRollNo(scan.nextInt());
			
			System.out.println("Enter student year : ");
			student.setYear(scan.next());
			
			int [] semMarks = new int [2] ; 
			System.out.println("Enter first sem marks : ");
			semMarks[0] = scan.nextInt();
			System.out.println("Enter second sem marks : ");
			semMarks[1] = scan.nextInt();
			int sum = semMarks[0]+semMarks[1];
			student.setSemMarks(semMarks);
			student.setAvg(sum/2);
			allStudent[eachstudent] = student;
		}
	}

}
