import java.util.Scanner;
public class array22 {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

		int[] interi = {1,6,-18,20,34,-56,81};
		// stampa
		for (int i=0; i < interi.length; i++)
			System.out.println(interi[i] + " ");
		// azzera tutti gli elementi del vettore
		for (int i = 0; i < interi.length; i++)
			interi[i] = 0;
		// assegnare 0, 1, 2, .. A.length-1 agli elementi di A
			for (int i = 0; i < interi.length; i++)
			interi[i] = i;
		
		// incrementa di 1 tutti gli elementi di A 
		for (int i = 0; i < interi.length; i++)
			interi[i] = interi[i] + 1;
		
		// assegna 1 se dispari e 2 se pari
	/*	for (int i = 0; i < interi.length; i++)	
		interi[i] = (i % 2 == 0) ? 2 : 1;
		*/
			for (int i = 0; i < interi.length; i++)	
				interi[i] = 2 - (i % 2);
		
		/*	if ( i % 2 == 0)
				interi[i] = 2;
			else
				interi[i] = 1;
		*/
		// stampa 
		for (int i = 0; i < interi.length; i++)
			System.out.println(interi[i] + " ");



}

}