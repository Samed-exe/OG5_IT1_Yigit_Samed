package primzahl;

public class Stoppuhr {
	static long start;
	static long stop;
	public static void start(){
		start = System.currentTimeMillis();
		
	}
	public static void stop() {
		stop = System.currentTimeMillis();
		
	}
	public static double Laufzeit() {
		
		return (stop - start);
	}
}
