package com.vatsalya.collectios_framework;

import java.util.ArrayList;


public class ItineraryPlanner {

	ArrayList<Destination> destinationList = new ArrayList<Destination>();
	
	
	public ItineraryPlanner() {
		super();
		this.destinationList = new ArrayList<Destination>();
	}

	public void addDestination(Destination dest) {
		
		destinationList.add(dest);
	}
	
	public void showDestinations() {
		
		for(int i = 0 ; i <destinationList.size();i++) 
		{	
			System.out.print((i+1)+". ");
			System.out.print(destinationList.get(i)+"\n");
			
		}	
	}
}
/*  ItineraryPlanner:
Manages a list of destinations.
Contains methods to add destinations and retrieve the list of destinations.
 */