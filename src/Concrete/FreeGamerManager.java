package Concrete;
import Abstracts.GamerManager;
import Entities.Gamer;

public class FreeGamerManager implements GamerManager {

	@Override
	public void showInformations(Gamer gamer) {
		
		System.out.println("Name: "+gamer.getFirstName()+
							"\nSurname:"+gamer.getLastName());
		
		
	}

	
}
