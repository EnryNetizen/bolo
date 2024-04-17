import java.util.*;

public class RicercaLineareArray {
	// tutti maggiori di 10
	public static boolean tuttiMaggiori10(int[] a, int n){
	if (n < 0){
		return true;
	} else if (a[n] <= 10){
	return false;
	} else {
	return tuttiMaggiori10(a, n-1);
	}
	}
	
	// cerca
		public static boolean cerca(int[] a, int x, int n) {
			if (n < 0) {
				return false;
			 } else if (a[n] == x){
				return true;
			 } else {
				return cerca(a, x, n-1);
			}
				}
 public static void main(String[] args) {
 

 	}
}

