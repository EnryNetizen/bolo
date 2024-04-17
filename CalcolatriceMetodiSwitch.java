import java.util.*;

public class CalcolatriceMetodiSwitch{
	
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int operator,n1,n2;
		int risultato = 0;
		System.out.println("1 - ADDIZIONE \n2 - SOTTRAZIONE \n3 - MOLTIPLICAZIONE \n4 - DIVISIONE");
		System.out.println("Scegli l'operatore: ");
		int operatore = scan.nextInt();
		System.out.println("Inserire il primo numero");
		n1 = scan.nextInt();
		System.out.println("Inserire il secondo numero");
		n2 = scan.nextInt();
		
		switch (operatore){
		case 1: 
			risultato = n1 + n2; 
			break;
		case 2: 
			risultato = n1 -n2;
			break;
		case 3:
			risultato = n1 * n2;
			break;
		case 4: 
			risultato = n1 / n2;
			break;
		default:
			System.out.println("l'operatore inserito non è valido");
		}
		System.out.println("Il risultato e': " + risultato);
		}
	}