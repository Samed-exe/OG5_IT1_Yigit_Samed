package Kickers;

public class Trainer extends Mitglieder{

	private char lizenzklasse;
	private int aufwandsentschädigung;
	
	public Trainer() {
		super();
		this.lizenzklasse = '0';
		this.aufwandsentschädigung = 0;
	}
	
	public char getLizenzklasse() {
		return lizenzklasse;
	}
	public void setLizenzklasse(char lizenzklasse) {
		this.lizenzklasse = lizenzklasse;
	}
	public int getAufwandsentschädigung() {
		return aufwandsentschädigung;
	}
	public void setAufwandsentschädigung(int aufwandsentschädigung) {
		this.aufwandsentschädigung = aufwandsentschädigung;
	}
	
	
	
}
