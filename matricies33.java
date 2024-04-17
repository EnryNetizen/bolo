import java.util.Arrays;

public class matricies33 {
	
	public static int doppio(int x){
		return 2*x;
	}
	
	public static int somma(int x, int y){
		return x + y;
	}
	
	public static double media(double x, double y){
		return (x + y) / 2;
	}
	
	public static void stampaMatrice(int[][] M){
		for (int i=0; i < M.length;  i++) {		
			for (int j=0; j < M[i].length;  j++)
				System.out.print(M[i][j] + "\t");
		
		System.out.println();
		}	
	}
	
	public static void stampaMatrice2(int[][] M){
		for (int i=0; i < M.length;  i++)			
			System.out.println(Arrays.toString(M[i]));
	}
	
	
	// Prende in input una matrice M (di interi)  
	// e mette a 0 tutti gli elementi dell'ultima riga
	public static void azzeraUltimaRiga(int[][] M){
		int ultimaRiga = M.length-1;
		for (int j=0; j < M[ultimaRiga].length; j++)
			M[ultimaRiga][j] = 0;
	}
	
	public static int[][] copiaMatrice(int[][] M){
		// nota: funziona solo su matrice bilanciate
		int[][] copia = new int[M.length][M[0].length];
		
		for (int i=0; i < M.length;  i++)		
			for (int j=0; j < M[i].length;  j++)
				copia[i][j] = M[i][j];
		
		return copia;
		
	}
	
	
	public static void main(String[] args) {
		
		int s = somma(6,7);
		int r = doppio(s);	
		int t = doppio(doppio(s));		
		
		//System.out.println(r);
		//System.out.println(t);
		System.out.println( media(3,4) );
		
		
		int[][] M = {
		{1,30,-4,-5}, 
		{19, -1, 29, 10}, 
		{-8, 7, 0, 1},
		{17, 0, 26, 12} 
		};
		
		int[][] M2 = {{1,30},{19, -1}};

        //int[][] B = M2
		int[][] B = copiaMatrice(M2);
		
		azzeraUltimaRiga(M2);
		
		stampaMatrice(B);
		
	}
	
}