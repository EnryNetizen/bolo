import java.util.Scanner;

public class array20{
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
		// 
		int i = 0;
		while (i < n){
			int x = scan.nextInt();
			if (x % n == 0){
				numeri[i] = x;
				i++;
			} else {
			System.out.println("Il numero inserito non è corretto riprova");
			}
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