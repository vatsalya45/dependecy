package com.vatsalya.collectios_framework;

public class CabCustomerServiceTester {

	public static void main(String[] args) {
		
		CabCustomer c1 = new CabCustomer(1,"Umesh","jkl","klo", 80,"099");
		CabCustomer c2 = new CabCustomer(2,"Chaitya","jkl","klo", 10,"9000909");
		CabCustomer c3 = new CabCustomer(3,"Manish","jkl","klo", 3,"099878090");
		CabCustomer c4 = new CabCustomer(4,"Abhay","jkl","klo", 1,"099");
		
		CabCustomerService cs = new CabCustomerService();
		cs.addCabCustomer(c1);
		//cs.addCabCustomer(c3);
		cs.addCabCustomer(c2);
//		cs.addCabCustomer(c4);
		
		//System.out.println(cs.isFirstCustomer(c1));
		//cs.calculateBill(c1);
		
//		System.out.println(cs.print(c2));
		System.out.println(cs.print(c1));
//		System.out.println(cs.print(c3));
		System.out.println(cs.print(c3));
		System.out.println(cs.print(c4));
		
		
		
		
		
		
	}

}
/* Note : 
	   Assume one customer books only one cab at a time.
	   No charge for customer booking the cab for the first time.
	   Customer's phone number is key to test a new customer or old customer.
	   Distance should be treated as kilometers 				 
				 
A CabCustomerServiceTester is given with main() where you can create various objects and test them.  */