package Concrete;
import java.util.Scanner;

import Entities.Game;
import Entities.Gamer;

public class SystemManager {
	Scanner scan = new Scanner(System.in);
	
	
	
	
	
	public void updateInformationsOfGamer(Gamer gamer) {
		boolean endTheLoop=true;
		while(endTheLoop) {
			System.out.println( " \nUpdating Page\n-----------------------\n"
					+ "1.Update first name\n"+
								"2. Update last name\n"+
								"3. To quit enter 'q' \n" +
								"Enter the selecion:");
			String selection = scan.nextLine();
			String temporaryValue;
			
			switch(selection) {
			case "1":
				
				System.out.println("New name:");
				temporaryValue=scan.nextLine();	
				gamer.setFirstName(temporaryValue);
				System.out.println("New name: "+temporaryValue);
				
						break;
			case "2":
				System.out.println("New surname:");
				temporaryValue=scan.nextLine();	
				gamer.setLastName(temporaryValue);
				System.out.println("New surname: "+temporaryValue);
						break;
			
			case "q":
				endTheLoop=false;
				System.out.println("Updating ended.");
						break;
						
			default : System.out.println("Invalid selection. Try again!");	
						break;
			}
			
		}
	}
	
	public void deleteTheGamer(Gamer gamer) {
		
		System.out.println(gamer.getFirstName() + "'s account has been deleted successfully.");
		
	}
	

}
