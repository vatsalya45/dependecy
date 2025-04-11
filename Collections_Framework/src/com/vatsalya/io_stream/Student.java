package com.vatsalya.io_stream;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

@SuppressWarnings("serial")
public class Student implements Serializable
{
	private Integer studentId;
	private String studentName;
	private Double studentFees;
	private LocalDate dateOfAdmission;

	public Student(Integer studentId, String studentName, Double studentFees, LocalDate dateOfAdmission) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
		this.dateOfAdmission = dateOfAdmission;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Double getStudentFees() {
		return studentFees;
	}

	public void setStudentFees(Double studentFees) {
		this.studentFees = studentFees;
	}

	public LocalDate getDateOfAdmission() {
		return dateOfAdmission;
	}

	public void setDateOfAdmission(LocalDate dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}

	public static Student getStudentObject() {

		Scanner sc = new Scanner(System.in);

		try(sc) {

			System.out.println("Enter the ID of the Student");
			Integer studentId = sc.nextInt();

			sc.nextLine();
			
			System.out.println("Enter the Name of the Student");
			String studentName = sc.nextLine();

			System.out.println("Enter the fees of the Student");
			Double studentFees = sc.nextDouble();

			System.out.println("Enter the ID of the Student");
			LocalDate dateOfAdmission = LocalDate.now();
			// Do not take Date it does not contain any good method.
			
			return new Student(studentId, studentName, studentFees, dateOfAdmission);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		
	}

	@Override
	public String toString() {
		return "Student [studentId= "+studentId+"\nstudentName= "+studentName+"\nstudentFees= "+studentFees+"\ndateOfAdmission ="+dateOfAdmission+" ]";
	}
	

}
/*
 * Program: 1 ---------------- Write a Program in Java to Perform Serialization
 * and De-serialization operation on ArrayList Object. Take a BLC class Student
 * Instance variables studentId – private – Integer studentName – private –
 * String studentFees – private – Double dateOfAdmission – private – Date Take a
 * parameterized constructor to initialize the instance variables
 * 
 * Take a Method getStudentObject() Method Name - getStudentObject() Parameter -
 * No Parameter Access Modifier - public and static Return type - Student This
 * method should take the Student data from client, create and return Student
 * object from this method.
 * 
 * Override toString() method to print Student class properties or variables.
 * Take an ELC class StoreObject Inside the main method create a for loop which
 * will read the Student object with user choice and Store the Student object to
 * a file called Student.txt Take another ELC class RetrieveObject This class
 * will retrieve the Student Object from file and print the Student information
 * data.
 */