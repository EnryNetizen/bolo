import java.util.Scanner;

public class array10{
	public static void stampa(int[] valori){
		for (int i = 0; i < valori.length; i++){
		System.out.println(valori[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserisci la lunghezza dell'array");
		int n = scan.nextInt();
		int[] numeri = new int [n];
		System.out.println("Inserisci una serie di numeri");
		for (int i = 0; i < n; i++){
			int x = scan.nextInt();
			numeri[i] = x;
		}
		stampa(numeri);
		
		System.out.println("***");
		
		int t = numeri[0];
		for (int j = 0; j < n - 1; j++){
			numeri[j] = numeri[j + 1];
		}
		numeri[numeri.length - 1] = t; 
		stampa(numeri);
		
		
	
	
	
	}

}