import java.util.*;

public class fattoriale{
	// fatt
	public static int fatt(int n) {
			int res = 0;
		if (n==0){
			return 1;
		 } else { 
			return n * fatt(n - 1);
		}
	}
	// fibonacci somma
	public static int fibonacci(int n){
		if (n == 0 || n == 1) {
			return 1;
		} else {
				return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	// sommaPrimiN
	public static int sommaPrimiN(int n){
		// caso base
	if (n==0){
		return 0;
		// caso ricorsivo
	 } else { 
		return n + sommaPrimiN(n - 1);
	}
	}
	
	public static void countdown(int n){
		// caso base
	if (n >= 0){
		System.out.println(n);
		countdown(n-1);
		//passo
	} else {
	System.out.println();
	}
	}

	// main 
public static void main(String[] args){
	int x = 5;
	System.out.println(fatt(5));
	System.out.println(fibonacci(5));
	System.out.println(sommaPrimiN(10));
	countdown(10);
}
}