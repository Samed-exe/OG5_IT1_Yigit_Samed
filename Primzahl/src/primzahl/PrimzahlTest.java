package primzahl;
import java.util.Scanner;

public class PrimzahlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Geben sie eine zahl ein:");
			long zahl = scan.nextLong();
			Stoppuhr.start();
			if (Primzahl.isPrim(zahl) == true) {
				System.out.println(zahl + " ist eine Primzahl.");
			} else {
				System.out.println(zahl + " ist keine Primzahl.");
			}
			Stoppuhr.stop();
			System.out.println("Die Zeit beträgt: " + Stoppuhr.Laufzeit());
		}
		

	}

}
	


