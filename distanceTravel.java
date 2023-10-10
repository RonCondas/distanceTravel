package distanceTravel;

import java.util.Scanner;

public class distanceTravel {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner (System.in);
		//variable
		int counter = 1;
		
		double speed = 0.0;
		
		double time = 0.0;
		
		double distance = 0.0;
		//talk to the user
		
		System.out.println("Please enter the speed in mph per hour ");
		speed = kb.nextInt();
		
		System.out.println("Please enter the time in hours ");
		
		
		// store
		time = kb.nextInt();
		
		
		while(counter <= time) {
		//calculation or logic
		distance = (int) (speed * counter);
		// display
		System.out.println(counter + "\t" + distance);
		 
		counter++;
		}
	}

}
