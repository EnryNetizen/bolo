import java.util.*;

public class RicercaArray {
	public static void main(String[] args){
		int[] numeri = new int[100];
		Random random = new Random();
		int obbiettivo = random.nextInt(500);
		for (int i = 0; i < numeri.length; i++){
			 numeri[i] = random.nextInt(500);
		}	
		int posizione = -1;
		for (int i = 0; i < numeri.length; i++){
			if (numeri[i] == obbiettivo){
				posizione = i;
			}
		}
		if (posizione == -1){
			System.out.println("non trovato");
		
		} else {
			System.out.println("trovato: " + posizione);
		
		}
	
	}
}