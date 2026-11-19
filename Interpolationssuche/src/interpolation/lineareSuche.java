package interpolation;

public class lineareSuche {
	public static long lineareSuche(long[] a, long gesuchteZahl){
		for(int i = 0; i < a.length; i++) {
			if(a[i] == gesuchteZahl) {
				return i;
			}
		}
return -1;
	}
}
