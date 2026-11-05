package primzahl;

public class Primzahl {
	public static boolean isPrim(long zahl){
		
		if (zahl < 2) {
			return false;
		}
		
		for (int i = 2; i<zahl ; i++ ) {
			if(zahl % i == 0) {
			return false;
		}
	
	}
		
		return true;
	}
}
