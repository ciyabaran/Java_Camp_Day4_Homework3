package Concrete;

import Entities.Game;

public class GameShop {
	
	
	public void ListGames(Game[] games) {
	
		System.out.println("\nAll Games\n------------------------");
		for(Game game : games) {
			System.out.println(game.getNameOfGame()+"---> $"+game.getUnitPrice());
		}
		
	}
	

}
