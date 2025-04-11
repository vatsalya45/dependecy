package com.vatsalya.io_stream;

import java.io.*;

public class RetrieveObject {

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		
		
		var fis = new FileInputStream("c:\\new\\Student_Info.txt");
		var ois = new ObjectInputStream(fis);
		
		try(fis;ois){
			
			Student student = null;
			
			while((student = (Student) ois.readObject()) != null) {
				
				System.out.println(student);
			}
			
		}catch (java.io.EOFException e) {
			
			System.out.println(e.getMessage()+" File khatm");
		}

	}

}
