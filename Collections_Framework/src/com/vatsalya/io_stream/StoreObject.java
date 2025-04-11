package com.vatsalya.io_stream;

import java.io.*;
import java.util.Scanner;
public class StoreObject {

	public static void main(String[] args) throws IOException {
		
		
		//Sereilization
		
		FileOutputStream fos = new FileOutputStream("C:\\new\\Student_Info.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
			
		Scanner sc = new Scanner(System.in);
			
		try (fos;oos;sc){
			
			System.out.println("How many students you want to enroll");
			int enroll = sc.nextInt();
			
			for(int i = 0 ; i<enroll;i++) {
				
				Student student = Student.getStudentObject();
				oos.writeObject(student);
			}
			System.out.println("Student enrollment process completed");
			
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		

	}

}
/* Take an ELC class StoreObject
Inside the main method create a for loop which will read the Student 
object with user choice and Store the Student object to a file called 
Student.txt
Take another ELC class RetrieveObject
This class will retrieve the Student Object from file and print the 
Student information data. */ 