//Arkadii Redozubov, 3187445
package griffith;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		TASK 1
//		declare an ArrayList of Student objects
		ArrayList<Student>students  = new ArrayList<>();
//		initialize and add student objects to Student ArrayList
		students.add(new Student("Arkadii Redozubov",3187445, "Griffith College Dublin", "BSc (Hons) in Computing Science", "29/07/2007", "30/09/2025"));
		students.add(new Student("Leo Smith",3154335, "Griffith College Dublin", "BSc (Hons) in Business", "10/06/2005", "30/09/2025"));
		students.add(new Student("Jack Brown",3175345, "Griffith College Dublin", "BSc (Hons) in Music", "05/09/2008", "30/09/2025"));

//		iterate through the list of student objects, print all information by calling the method display
		for(int i = 0; i< students.size();i++) {
			if(i>0) 
				System.out.println();
			System.out.println("Student " + (i+1));
			students.get(i).display();
;		}
//		change student name and display an updated information
		students.get(1).setName("Ben");
		System.out.println("\nStudent 2");
		students.get(1).display();
		
		
//		TASK 2
//		Declare an ArrayList of Building objects
		ArrayList<Building> buildings = new ArrayList<>();
		
//		initialize and add Building objects to Building ArrayList
		buildings.add(new Building("Dublin Castle", 1, new Address("D02 PD90", "Dame Street", "Dublin", new Location(53.3429, -6.2674))));
		buildings.add(new Building("Trinity College Dublin", 1, new Address("D02 PN40", "College Green", "Dublin", new Location(53.3444, -6.2577))));
		buildings.add(new Building("The Spire", 48, new Address("D01 F5P2", "O'Connell Street Lower", "Dublin", new Location(53.3498, -6.2603))));
		
//		initialize and add CommercialBuilding objects to Building ArrayList
		buildings.add(new CommercialBuilding( 
				"Monday-Thursday: 8:30 AM-8:00 PM\n"
				+ "Friday-Saturday: 8:30 AM-7:00 PM\n"
				+ "Sunday: 11:00 AM-7:00 PM\n", 
				"Stephen's Green Shopping Centre", 113, new Address("D02 HX65", "St. Stephen's Green West", "Dublin", new Location(53.3398, -6.2617))));
		buildings.add(new CommercialBuilding(
				"Monday-Friday: 9:00 AM-9:00 PM\n"
				+ "Saturday: 9:00 AM-7:00 PM\n"
				+ "Sunday: 10:00 AM-7:00 PM\n", 
				"Dundrum Town Centre", 1, new Address("D16 X4K7", "Sandyford Road", "Dublin", new Location(53.2926, -6.2461))));
		buildings.add(new CommercialBuilding("Arnotts", 12, new Address("D01 C3Y9", "Henry Street", "Dublin", new Location(53.3491, -6.2631))));
	
//		iterate and print all buildings information  
		System.out.println("\nAll buildings:");
		for(Building building:buildings) {
			System.out.println(building.getInfo());
			}
		
//		Ask user for an eircode, print all matches, print "no matches" if no matches is found 
		System.out.print("Enter an Eircode: ");
		String eircode = scan.nextLine();
		System.out.println("\nAll matching buildings:");
		boolean found = false;
		for(Building building:buildings) {
//			Check if the building's Eircode matches user input, ignore case and whitespaces at the start and the end of the input
			if(building.getAddress().getEircode().trim().equalsIgnoreCase(eircode.trim())) {
			System.out.println(building.getInfo());
			found = true;
			}
			}
		if(!found)
			System.out.println("no matches");
		
		
		
		
		scan.close();
	}

}
