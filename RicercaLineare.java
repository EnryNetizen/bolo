import java.util.*;

public class RicercaLineare {
	
	public static boolean cerca(int[] a, int x, int n) {
	if (n < 0) {
		return false;
	 } else if (a[n] == x){
		return true;
	 } else {
		return cerca(a, x, n-1);
	}
		}

	public static boolean cerca(int[] a, int x) {
		return cerca(a, x, a.length-1);
	}

 public static void main(String[] args) {
 	int[] a = {1,8,19,10,21,22,17};
 	int[] b = {1,8,19,10,21,22,27};
 	System.out.println(cerca(a, 19));
 	

 }
}

