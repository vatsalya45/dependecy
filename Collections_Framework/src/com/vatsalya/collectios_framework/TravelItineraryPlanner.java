package com.vatsalya.collectios_framework;

public class TravelItineraryPlanner {

	public static void main(String[] args) {
		
		ItineraryPlanner ajay = new ItineraryPlanner();
		
		
		Activity a1 = new Activity("Visit Eiffel Tower", "(Morning)");
		Activity a2 = new Activity("Louvre Museum", "(Evening)");
		Activity a3 = new Activity("British Museum", "(Morning)");
		Activity a4 = new Activity("London Eye", "(Evening)");
		
		Destination paris = new Destination("Paris");
		Destination london = new Destination("London");
		
		paris.addActivities(a1);
		paris.addActivities(a2);
		london.addActivities(a3);
		london.addActivities(a4);
		
		ajay.addDestination(paris);
		ajay.addDestination(london);
		
		ajay.showDestinations();
		ajay.showDestinations();

	}

}
/*   TravelItineraryPlanner (Main Class):
Creates an instance of ItineraryPlanner.
Creates two Destination objects: "Paris" and "London".
Adds activities to each destination.
Adds these destinations to the itinerary planner.
Displays the itinerary by listing destinations and their respective activities.


Output:-
Destination: Paris
- Visit Eiffel Tower (Morning)
- Louvre Museum (Afternoon)

Destination: London
- British Museum (Morning)
- London Eye (Afternoon) */