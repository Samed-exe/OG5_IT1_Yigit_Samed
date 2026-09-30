package Kickers;

public class Mannschaftsleiter extends Spieler {

	private String nameMannschaft;
	private int bekommtRabatt;
	
	public Mannschaftsleiter() {
		super();
		this.bekommtRabatt = 0;
		this.nameMannschaft = "";
	}
	
	public String getNameMannschaft() {
		return nameMannschaft;
	}
	public void setNameMannschaft(String nameMannschaft) {
		this.nameMannschaft = nameMannschaft;
	}
	public int getBekommtRabatt() {
		return bekommtRabatt;
	}
	public void setBekommtRabatt(int bekommtRabatt) {
		this.bekommtRabatt = bekommtRabatt;
	}
	
	
	
	
}
