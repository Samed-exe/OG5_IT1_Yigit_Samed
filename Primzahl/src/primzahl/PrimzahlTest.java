package primzahl;
import java.util.Scanner;

public class PrimzahlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Geben sie eine zahl ein:");
			int zahl = scan.nextInt();
			
			if (isPrim(zahl) == true) {
				System.out.println(zahl + " ist eine Primzahl.");
			} else {
				System.out.println(zahl + " ist keine Primzahl.");
			}
		}
		

		



	}
	public static boolean isPrim(int zahl){
	
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
	


