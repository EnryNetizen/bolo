import java.util.Scanner;
import java.util.Arrays;
public class matricies1prova {
public static void main(String[] args){
//	int[] A = {1,2,3,4};
	int[] [] M = {
	{1,30,-4,-5},
	{19,-1,29,10},
	{-8,7,7,1}
	};
	/*
	int[] [] M2 = new int[3][4];
	
	M2[0][0] =1;
	M2[0][1] =1;
	M2[0][2] =1; 
	M2[0][3] =1; 
	
	M2[1][0] =1; 
	M2[1][1] =1; 
	M2[1][2] =1; 
	M2[1][3] =1; 
	
	M2[2][0] =1; 
	M2[2][1] =1; 
	M2[2][2] =1; 
	M2[2][3] =1; 
	
	// per ogni riga
	for(int i = 0; i < M1.length; i++)
		//stampa la riga
	System.out.println(Arrays.toString(M[i]));
	
	*/
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
	
	// System.out.println(Arrays.toString(M1.length));
	// System.out.println(Arrays.toString(M1[0].length));


}
}