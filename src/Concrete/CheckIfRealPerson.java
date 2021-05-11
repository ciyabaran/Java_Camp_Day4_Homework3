package Concrete;
import Abstracts.EdevletLog;
import Entities.Gamer;

public class CheckIfRealPerson implements EdevletLog{

	public boolean check(Gamer gamer) {
	
		
		System.out.println(gamer.getFirstName()+ "'s informations are true"); 
		return true;
	}
	
	
	
	

}
