import java.util.*;

public class sovraccarichi2 {

	 static int somma(int x, int y) {
	 return x + y;
	 }
	 static int somma(int x, int y, int z) {
	 return x + y + z;
	 }
	 static int somma(int[] a){
	 int s = 0;
	 for (int i = 0; i < a.length; i++)
		 s += a[i];
	 return s;
	 
	 }
 
	public static double media(int a, int b, int c){
	return ((double) a + b + c) / 3;
	}
	public static double media(int[] a){
	return (double) somma(a)/a.length;
	}
	public static double media(int[][] m){
	double s = 0;
	int numElementi = 0;
	for (int i = 0; i < m.length; i++){
		numElementi += m[i].length;
		
		for(int j = 0; j < m[0].length; j++)
		s += m[i][j];
	}
	return s / numElementi;
	}
	

 public static void main (String[] args) {
 	
	 System.out.println(somma(1,1));
	 System.out.println(somma(1,2,3));
	 
	 int[] a = {1,2,3};
	 int[][] m = {{2,2,2},{4,4,4}};
	 
	 System.out.println(somma(a));
	 System.out.println(media(2,3,4));
	 System.out.println(media(a));
	 System.out.println(media(m));
	 
 }
}

