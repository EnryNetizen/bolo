import java.util.Arrays;
import java.util.Scanner;
public class matricies2 {
public static void main(String[] args) {
//	int[] A = {1,2,3,4};
	int k = 3;  
	int[] [] M = {
	{1,3,-4,-5},
	{9,-1,2,10},
	{-8,7,0,1},
	{-3,8,9,6}
	};
	// conta le righe con lo zero
	int contaRigheConZero = 0;
	for (int i = 0; i < M.length; i++) {
		for (int j = 0; j < M[i].length; j++){
			if (M[i][j] == 0) {
				contaRigheConZero += 1;
				break;
	
	}
	}
	}
	// somma le righe
	int sommaRigak = 0;
	int sommaColonnak = 0;
	int somma = 0;
	for (int j = 0; j < M[k].length; j++)
		sommaRigak += M[k][j];
	for (int i = 0; i < M.length; i++)
		sommaColonnak += M[i][k];
		
		
		
		
	System.out.println("Somma riga con indice" + k + ": " + sommaRigak);
	System.out.println("Somma colonna con indice" + k + ": " + sommaColonnak);



}
}