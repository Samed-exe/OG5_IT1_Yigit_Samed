package interpolation;

public class InterpolationssucheMethode {
	public static long interpolationsSuche(long[] a ,long gesuchteZahl) {
		 int start = 0, end = a.length - 1;
	        while (start <= end && gesuchteZahl >= a[start] && gesuchteZahl <= a[end]) {
	            if (start == end) {
	                if (a[start] == gesuchteZahl) return start;
	                return -1;
	            }
	            long pos = start + ((end - start) / (a[end] - a[start])) * (gesuchteZahl - a[start]);
	            if (a[(int) pos] == gesuchteZahl)
	                return pos;
	            if (a[(int) pos] < gesuchteZahl)
	                start = (int) (pos + 1);
	            else
	                end = (int) (pos - 1);
	        }
	        return -1;
	    }
		
	}

