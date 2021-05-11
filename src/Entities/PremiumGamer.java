package Entities;
public class PremiumGamer extends Gamer{
	
	private double balance;
	
	
	public PremiumGamer(String nationalId, String firstName, String lastName, int yearOfBirth, Game[] purchasedGames,double balance) {
		super(nationalId, firstName, lastName, yearOfBirth, purchasedGames);
		this.balance=balance;

	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	
	}
	
	
	
	
	
}
