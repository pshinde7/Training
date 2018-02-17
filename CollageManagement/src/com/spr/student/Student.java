package com.spr.student;

public class Student {
	
	String studentName;
	int rollNo;
	String year;
	int [] semMarks = new int [2];
	double avg;
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int[] getSemMarks() {
		return semMarks;
	}
	public void setSemMarks(int[] semMarks) {
		this.semMarks = semMarks;
	}

}
