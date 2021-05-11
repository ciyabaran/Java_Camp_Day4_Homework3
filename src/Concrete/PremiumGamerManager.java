package Concrete;
import Abstracts.GamerManager;
import Entities.Gamer;
import Entities.PremiumGamer;

public class PremiumGamerManager implements GamerManager {



	
	@Override
	public void showInformations(Gamer gamer) {
		
		System.out.println("Name: "+gamer.getFirstName()+
				"\nSurname:"+gamer.getLastName());
		
		
		
	}

	public void addOneDollarPerWeek(PremiumGamer gamer) {
		System.out.println("$1 added to the balance.");
		gamer.setBalance(gamer.getBalance()+1);
		System.out.println("Balance: " + gamer.getBalance());
	}
	
}
