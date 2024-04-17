import java.util.Scanner;

public class arraymaxvalore2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		// variabile di controllo per verificare il max dei numeri
		
		// creazione array
		System.out.println("Inserire la lunghezza dell'array");
		int n = scan.nextInt();
		// creazone array
		int[] numeri = new int[n];
		// riempimento array
		System.out.println("Inserire i numeri");
		for (int i = 0; i < n; i++){
			int x = scan.nextInt();
			numeri[i] = x;
		}
		// controllo valore massimo 
		int maxx = numeri[0];
		for (int j = 0; j < numeri.length; j++){
			if (numeri[j] > maxx){
				maxx = numeri[j];
				
			}
		}
		System.out.println("Il valore massimo e': " + maxx);
	}

}