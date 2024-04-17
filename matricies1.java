import java.util.Scanner;
import java.util.Arrays;
public class matricies1 {
public static void main(String[] args){
//	int[] A = {1,2,3,4};
	int k = 2;  
	int[] [] M = {
	{1,30,-4,-5},
	{19,-1,29,10},
	{-8,7,7,1}
	};
	for (int j = 0; j < M[k].length; j++) 
		M[k][j] = 0;
	
	for (int i = 0; i < M.length; i++) 
		M[i][k] = 0;
	// per ogni riga i
	for (int i = 0; i < M.length; i++){
	// stampa la riga i
	// cioè per ogni colonna i
	// stampa elementi (i,j)
	for(int j = 0; j < M[i].length; j++) {
		System.out.print(M[i][j] + "\t");
	
	
	}
	System.out.println();
	}
}
}