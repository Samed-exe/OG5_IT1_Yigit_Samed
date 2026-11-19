package interpolation;
import java.util.Random;
import java.util.Scanner;
public class ListGenerator {



	public static long[] getSortedList(int laenge){
		Random rand = new Random(111111);
		long[] zahlenliste = new long[laenge];
		long naechsteZahl = 0;

		for(int i = 0; i < laenge; i++){
			naechsteZahl += rand.nextInt(3)+1;
			zahlenliste[i] = naechsteZahl;
		}

		return zahlenliste;
	}



	public static void main(String[] args){
		final int ANZAHL = 20000000; //20.000.000
		Scanner scan = new Scanner(System.in);
		long[] a = getSortedList(ANZAHL);

		System.out.println("Bitte geben sie eine Zahl ein, die gesucht werden soll.");
		long gesuchteZahl = scan.nextLong();
		System.out.println("Welcher suchalgorithmus soll benutzt werden? (lineare Suche = 1; Interpolationssuche = 2)");
		int auswahl = scan.nextInt();
		
		if (auswahl == 1) {
		long time = System.currentTimeMillis();
		System.out.println(lineareSuche.lineareSuche(a, gesuchteZahl));
		System.out.println(System.currentTimeMillis() - time + "ms");
		}


		else {
			long time = System.currentTimeMillis();
			System.out.println(InterpolationssucheMethode.interpolationsSuche(a, gesuchteZahl));
			System.out.println(System.currentTimeMillis() - time + "ms");
		}
		//for(long x: a)
		//	System.out.println(x);		




	}
}

