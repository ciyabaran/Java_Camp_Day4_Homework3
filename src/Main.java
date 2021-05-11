import Concrete.CheckIfRealPerson;
import Concrete.GameShop;
import Concrete.PremiumGamerManager;
import Concrete.SetCampaignForPremiumUsers;
import Concrete.SetCampaignforFreeUsers;
import Concrete.SystemManager;
import Entities.Campaign;
import Entities.FreeGamer;
import Entities.Game;
import Entities.Gamer;
import Entities.PremiumGamer;

public class Main {

	public static void main(String[] args) {
		
		SystemManager systemManager = new SystemManager();
		PremiumGamerManager gamerManager = new PremiumGamerManager();
		CheckIfRealPerson checkIfRealPerson = new CheckIfRealPerson();
		GameShop gameShop = new GameShop();
		Campaign campaign = new Campaign(15);
		
		
		
		Game gta = new Game("GTA V",99,"5.3"); Game pes21 = new Game("PES2021",75,"12.1"); Game cs = new Game("Counter Strike",15,"1.6");
		Game[] allGames =  {new Game("Call of Duty",70,"1.9"),new Game("Half Life",13,"1.7"),pes21,gta,cs};
		
		Game[] games = {gta,pes21,cs};
		Game[] games2 = {pes21};
		
		
		
		PremiumGamer ciya = new PremiumGamer("123456789","Ciya","ONER",2000, games,653);
		if( checkIfRealPerson.check(ciya) ){
			gamerManager.showInformations(ciya);
			System.out.println("Balance: "+ciya.getBalance()+"\n");
			System.out.println("New gamer has been added to the system.");
			
			}
		
		
		
		
		FreeGamer baran = new FreeGamer("987654321","Baran","ONER",2000,games2);
		if( checkIfRealPerson.check(baran) ){
			gamerManager.showInformations(baran);
			System.out.println("New gamer has been added to the system.");
			}
		
		systemManager.updateInformationsOfGamer(ciya);
		
		systemManager.deleteTheGamer(baran);

		gameShop.ListGames(allGames);
		
		SetCampaignforFreeUsers setCampaignforFreeUsers = new SetCampaignforFreeUsers();
		setCampaignforFreeUsers.setCampaign(campaign, cs);
		SetCampaignForPremiumUsers setCampaignForPremiumUsers= new SetCampaignForPremiumUsers();
		setCampaignForPremiumUsers.setCampaign(campaign, cs);
		
	}

}
