import java.util.*;

public class RicorsivoSommaArray{

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
	// countdown
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
	
	// somma es slide 23/11/2023
	public static int somma(int[] a, int n){
	if(n == 0){
	return 0;
	} else {
	return a[n-1] + somma(a, n-1);
	}
	}
	
	// conta dispari
	public static int contaDispari(int[] a, int n){
		/*
	// caso base: vettore vuoto
	if(n == 0) {
	return 0;
	// trovato un valore dispari 
	} else if (a[n] % 2 == 1){
	return 1 + contaDispari(a, n-1);
	// trovato un pari
	} else {
	return contaDispari(a, n-1);
	}
	*/
	
	// caso base: vettore vuoto
	if(n == 0) {
	return (a[n] % 2);
	} else {
	return (a[n] % 2) + contaDispari(a, n-1);
	}
	}
	
	/////////////////////////////////////////////////
	public static int contaDispari(int[] a){
	return contaDispari(a, a.length -1);
	}
	public static void scriviParole(int n){
		// caso base
		if (n < 10) {
			System.out.println(leggiCifra(n));
			// caso ricorsivo
		} else {
		System.out.println(leggiCifra(n % 10));
		
		scriviParole(n / 10);
		}
	}
	
	public static String leggiCifra(int x){
		String[] cifre= {"zero","uno","due","tre","quattro","cinque","sei","sette","otto","nove","dieci"};
	return cifre[x];
	}
	////////////////////////////////////////////////
	
	// potenza
	public static int potenza(int x, int n){
	if (n == 0) {
		return 1;
	} else {
		return x * potenza(x, n-1);
	}
	}
	
	
	// main 
public static void main(String[] args){
	
	int x = 5;
	System.out.println(fatt(5));
	System.out.println(fibonacci(5));
	System.out.println(sommaPrimiN(4));
	System.out.println("!gang!");
	countdown(10);
	
	System.out.println("!gang!");
	int[] a = {1,8,19,9,21,22,23,17,5,13};
	 // contaDispari(a, 6);
	System.out.println(contaDispari(a, 6));
	System.out.println(contaDispari(a));
	System.out.println("!gang!");
	
	scriviParole(22);
	System.out.println(potenza(9,9));
}
}