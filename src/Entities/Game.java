package Entities;

public class Game {
	
	private String nameOfGame;
	private double unitPrice;
	private String lastVersion;
	
	
	public Game(String nameOfGame, double unitPrice, String lastVersion) {
		this.nameOfGame = nameOfGame;
		this.unitPrice = unitPrice;
		this.lastVersion = lastVersion;
	}


	public String getNameOfGame() {
		return nameOfGame;
	}


	public void setNameOfGame(String nameOfGame) {
		this.nameOfGame = nameOfGame;
	}


	public double getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}


	public String getLastVersion() {
		return lastVersion;
	}


	public void setLastVersion(String lastVersion) {
		this.lastVersion = lastVersion;
	}
	
	
	
	
	

}
