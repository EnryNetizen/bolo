import java.util.*;

	public class sovraccarichi {
		// class Overloading {
		 static int somma(int x, int y) {
		 return x + y;
		 }
		 static int somma(int x, int y, int z) {
		 return x + y + z;
		 }
		 static int somma(int[] a){
		 int s = 0;
		 for (int i = 0; i < a.length; i++)
			 s =+ a[i];
		 return s;
		 }
		 // }
  	public static void main (String[] args) {
		 System.out.println(somma(1,1));
		 System.out.println(somma(1,2,3));
		 int[] a = {1,2,3};
		 System.out.println(somma(a));
		 }
}

