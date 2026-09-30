package Kickers;

public class Spieler extends Mitglieder{
	
	private int trikotNr;
	private String position;
	
	public Spieler() {
		super();
		this.trikotNr = 0;
		this.position = "";
	}
	
	public int getTrikotNr() {
		return trikotNr;
	}
	public void setTrikotNr(int trikotNr) {
		this.trikotNr = trikotNr;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	

}
