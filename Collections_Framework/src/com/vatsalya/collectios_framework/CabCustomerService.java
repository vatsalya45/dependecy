package com.vatsalya.collectios_framework;

import java.util.ArrayList;

public class CabCustomerService {

	private ArrayList<CabCustomer> cabCustomers = new ArrayList<CabCustomer>();
	
	public void addCabCustomer(CabCustomer cust) {
		
		if(isFirstCustomer(cust)) {
			cabCustomers.add(cust);
		}
		else {
			System.out.println("Already exist");
		}
	}
	
	public boolean isFirstCustomer(CabCustomer cust) 
	{
		for(CabCustomer c : cabCustomers) 
		{
			if(c.getPhone().equals(cust.getPhone())) 
			{
				return false;
			}
		
		}
		return true;
	}
	public double calculateBill(CabCustomer c1) {
		
		if(isFirstCustomer(c1)) {
			cabCustomers.add(c1);
			return 0;
		}
		else if(c1.getDistance()<=4) {
			return 80;
		}
		else if(c1.getDistance()>4) {
			
			double bill = 80 + (6* (c1.getDistance()-4));
			return bill;
		}
		return -1;
	}
	
	public String print(CabCustomer c2) {
		
		return c2.getCustomerName()+" please pay your bill of Rs "+calculateBill(c2);
	}
}
/*
Define the following in the  class CabCustomerService and write logics in the following methods:
private : Generic ArrayList to represent list of CabCustomers.
public : addCabCustomer() : Add the customer object parameter to the ArrayList
			    isFirstCustomer(): Check whether the customer object parameter is already existing in arrayList. 
			    				
Note : If phone number of a customer matches with any of the phone numbers of the array list, then consider it as a existing customer, otherwise consider the customer as new customer. 
				 
       calculateBill() should calculate and return the customer bill based on following rules
       1) if the customer is new return 0;
       2) if the customer's travel distance is below or equal    
          to 4 kms then return 80 (Rs).
       3) if the customer travel distance is above 4 kms calculate bill 80 + 6 per each km.
		 Ex: Any distance for new customer return 0;
		     distance 4 return 80
                     distance 6 return 80 + 6 * 6;
printBill() which should return the bill of the customer object parameter in the following format:

            output : JOHN Please pay your bill of Rs.0.0
	             SMITH Please pay your bill of Rs.180.0

	Note : 
	   Assume one customer books only one cab at a time.
	   No charge for customer booking the cab for the first time.
	   Customer's phone number is key to test a new customer or old customer.
	   Distance should be treated as kilometers  */