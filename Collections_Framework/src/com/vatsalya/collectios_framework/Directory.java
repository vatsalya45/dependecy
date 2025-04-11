package com.vatsalya.collectios_framework;

import java.util.ArrayList;
import java.util.Scanner;

public class Directory {

	ArrayList<Employee> al = new ArrayList<>();
	
	public void addEmployee(Employee e) {
		
		al.add(e);
	}
	
	public void displayAllEmployees() {
		
		System.out.println(al.toString());
	}
	
	public void updateEmployee(int index) {
		
		Scanner sc = new Scanner(System.in);
		try(sc;){
			Employee e1 = al.get(index);
			
			if(index < 0 && index >al.size()) 
			{
				System.out.println("This is not in the list");
			}
			else {
				System.out.println("What do you want to update");
				System.out.println("1)Name of the Employee");
				System.out.println("2)Position of the Employee");
				System.out.println("3)Salary of the Employee");
				
				
				int choice = sc.nextInt();
				sc.nextLine();
				switch(choice) {
				
					case 1:System.out.println("Update the name of the employee");
							String eName = sc.nextLine();
							e1.setName(eName);
							System.out.println("Updated name is "+e1.getName());
						break;
						
					case 2:System.out.println("Update the position of the employee");
							String ePos = sc.nextLine();
							e1.setPosition(ePos);
							System.out.println("Updated position is "+e1.getPosition());
						break;
						
					case 3:System.out.println("Update the salary of the employee");
							double eSal = sc.nextDouble();
							e1.setSalary(eSal);
							System.out.println("Updated salary is "+e1.getSalary());
						break;
					default:System.out.println("Invalid choice");		
				
				}
			}
		}
		catch(Exception e) 
		{
			e.getMessage();
		}
		
	}
	
	public void deleteEmployee(int index) {
		
		if(index >= 0 && index < al.size()) {
			
			al.remove(index);
		}
		else {
			System.out.println("Invalid index");
		}
	}
	
	
}
/* Directory Class:
This class manages a collection of Employee objects using an ArrayList.
The addEmployee() method adds an employee to the directory.
The displayAllEmployees() method prints details of all employees in the directory.
The updateEmployee() method updates an employee's information at a specified index in the directory.
The deleteEmployee() method removes an employee from the directory at a specified index. */





