package Kickers;

public class Schiedsrichter extends Mitglieder{

	private int anzahlGepfiffeneSpiele;

	public Schiedsrichter() {
		super();
		this.anzahlGepfiffeneSpiele = 0;
	}
	
	public int getAnzahlGepfiffeneSpiele() {
		return anzahlGepfiffeneSpiele;
	}

	public void setAnzahlGepfiffeneSpiele(int anzahlGepfiffeneSpiele) {
		this.anzahlGepfiffeneSpiele = anzahlGepfiffeneSpiele;
	}
	
	
	
}
