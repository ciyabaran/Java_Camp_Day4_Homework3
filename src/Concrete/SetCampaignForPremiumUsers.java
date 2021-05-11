package Concrete;
import Abstracts.SetNewCampaign;
import Entities.Campaign;
import Entities.Game;

public class SetCampaignForPremiumUsers implements SetNewCampaign{
	
	@Override
	public void setCampaign(Campaign campaign,Game game) {
		
		System.out.println("\nCAMPAIGN PAGE FOR PREMIUM USERS\nName of game: "+game.getNameOfGame()+
							"\nPrevious price: "+ game.getUnitPrice()+
							"\nNew price with campaign: " + (game.getUnitPrice()-(game.getUnitPrice()*((5+campaign.getDisscountRate())/100))));
	}

	
	

}

		
					