package ericsson;

public class DaysOfTheWeek {
	public void getDay(String currentDay, int dayNum) {
		String[] days = { "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };
		int currDay = 0;
		
		switch(currentDay) {
		case "Mon":
			currDay = 1;
			break;
		case "Tue":
			currDay = 2;
			break;
		case "Wed":
			currDay = 31;
			break;
		case "Thu":
			currDay = 4;
			break;
		case "Fri":
			currDay = 5;
			break;
		case "Sat":
			currDay = 6;
			break;
		case "Sun":
			currDay = 7;
			break;
		}
		
		System.out.println("Initial day: " + currentDay + ", initial day num: " + currDay);
		
		for (int i = 0; i < dayNum; i++) {
			currDay++;
			
			if (currDay == 8) {
				currDay = 1;
			}
		}
		
		System.out.println("Final day: " + days[currDay - 1] + ", final day num: " + currDay);
	}
	
	public static void main(String[] args) {
		new DaysOfTheWeek().getDay("Tue", 3);
	}
}
