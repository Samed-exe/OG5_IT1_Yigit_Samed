package de.oszimt.starsim2099;

public class Mond extends Himmelskoerper{

	//Attribute
	private String erzArt;

	
	//Methoden
	
	public String getErzArt() {
		return erzArt;
	}

	public void setErzArt(String erzArt) {
		this.erzArt = erzArt;
	}
	
	// Darstellung
		public static char[][] getDarstellung() {
			char[][] planetShape = { { '\0', '/', '*', '*', '\\', '\0' }, { '|', '*', '*', '*', '*', '|' },
					{ '\0', '\\', '*', '*', '/', '\0' } };
			return planetShape;

		}
	
}
