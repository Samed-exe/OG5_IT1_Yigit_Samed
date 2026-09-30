package Kickers;

public class Mitglieder {

private String name;
private String telefonNr;
private boolean beitragBezahlt;


public Mitglieder() {
	this.name = "";
	this.telefonNr = "";
	this.beitragBezahlt = false;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTelefonNr() {
	return telefonNr;
}
public void setTelefonNr(String telefonNr) {
	this.telefonNr = telefonNr;
}
public boolean isBeitragBezahlt() {
	return beitragBezahlt;
}
public void setBeitragBezahlt(boolean beitragBezahlt) {
	this.beitragBezahlt = beitragBezahlt;
}
	


}
