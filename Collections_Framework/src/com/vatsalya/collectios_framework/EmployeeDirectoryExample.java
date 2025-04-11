package com.vatsalya.collectios_framework;

public class EmployeeDirectoryExample {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Manish","SDE", 33000);
		Employee e2 = new Employee("Mukesh","TE", 13000);
		Employee e3 = new Employee("Mayank","JDE", 23000);
		
		Directory d = new Directory();
		d.addEmployee(e3);
		d.addEmployee(e2);
		d.addEmployee(e1);
		
		d.displayAllEmployees();
		d.updateEmployee(0);
		d.displayAllEmployees();
		
	}

}
/*  EmployeeDirectoryExample Class (Main Class):
This class contains the main() method where an instance of Directory is created.
Two employees, "Alice" and "Bob," are added to the directory with their respective positions and salaries.
The displayAllEmployees() method is called to show all employees.
The details of "Bob" are updated to reflect a change in position and salary.
"Alice" is deleted from the directory.
Finally, the updated list of employees is displayed again.


Output:-
Employee{name='Alice', position='Manager', salary=60000.0}
Employee{name='Bob', position='Developer', salary=50000.0}

Employee{name='Alice', position='Manager', salary=60000.0}
Employee{name='Bob', position='Senior Developer', salary=55000.0}

Employee{name='Bob', position='Senior Developer', salary=55000.0}

Initial display after adding "Alice" as a Manager and "Bob" as a Developer.
Display after updating "Bob's" information to reflect the change in position and salary.
Display after deleting "Alice" from the directory.
Final display of the remaining employee, "Bob", with his updated information.*/