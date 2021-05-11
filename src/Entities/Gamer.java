package Entities;
public class Gamer {

	private String nationalId;
	private String firstName;
	private String lastName;
	private int yearOfBirth;
	private Game[] purchasedGames;
	
	public Gamer() {
		
	}
	
	public Gamer(String nationalId, String firstName, String lastName, int yearOfBirth, Game[] purchasedGames) {
	
		this.nationalId = nationalId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
		this.purchasedGames = purchasedGames;
	}


	public String getNationalId() {
		return nationalId;
	}


	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getYearOfBirth() {
		return yearOfBirth;
	}


	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}


	public Game[] getPurchasedGames() {
		return purchasedGames;
	}


	public void setPurchasedGames(Game[] purchasedGames) {
		this.purchasedGames = purchasedGames;
	}
	
	
	
	
	
	
}