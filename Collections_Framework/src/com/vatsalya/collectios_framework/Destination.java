package com.vatsalya.collectios_framework;

import java.util.ArrayList;

public class Destination {

	private String destinationName;
	ArrayList<Activity> activityList = new ArrayList<Activity>();
	
	public Destination(String destinationName){
		super();
		this.destinationName = destinationName;
		this.activityList = new ArrayList<Activity>();
	}
	
	
	public String getDestinationName() {
		return destinationName;
	}

	public ArrayList<Activity> getActivityList() {
		return activityList;
	}

	public void addActivities(Activity act){
		activityList.add(act);
	}
	
	/* for(String cricketer : cricketers) {
			
			System.out.println(cricketer);
		} */
	
	public void showActivities() {
		
		for(Activity activity : activityList) {
			
			int i =0;
			System.out.print((i+1)+". ");
			System.out.println(activity);
			i++;
		}
	}


	@Override
	public String toString() {
		return "Destination [destinationName=]"+destinationName;
	}

	
	
	
	
}
/* Destination:
Represents a destination with a name and a list of activities.
Has a constructor to set the destination's name and initialize an empty list of activities.
Provides methods to add activities to the destination and retrieve the list of activities.
Overrides the toString() method to provide a string representation of a destination.
 */