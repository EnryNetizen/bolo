
import java.util.Arrays;
import java.util.Scanner;

public class sommaMatrici1 {
    public static void stampaMatrice(int[][]M){
        for(int i=0; i<M.length; i++){
            for (int j=0;j<M[i].length;j++)
                System.out.println(M[i] [j] + "\t");
            System.out.println();
        }
        System.out.println();
    }
    public static int [] [] chiediMatrice(int n, int m){
    	Scanner scan = new Scanner(System.in);
    	
        int [] [] M= new int [n] [m];
        
        for(int i=0; i<n; i++){
            for (int j=0;j<m;j++){
            	System.out.println("Intero in [" + i + "," + j + "]");
            	M[i][j] = scan.nextInt();
            }
        }
        return M;  
    }
    public static int[][] matriceDiZero(int n, int m){
    int[][] M = new int[n][m];
    for (int i = 0; i < n; i++) {
    	for (int j = 0; j < m; j++)
    	M[i][j] = 0;
    }
	return M;
    }
    // assume che le matrici abbiano stesse diemnsioni
    public static int[][] sommaMatrici(int[][] A, int[][] B){
		int[][] M = new int[A.length][A[0].length];
		for (int i = 0; i < A.length; i++){
			for (int j = 0; j < B[0].length; j++){
				M[i][j] = A[i][j] + B[i][j];
			}
		}
		return M;
    }
    /*
    //
    //
    // assume che le matrici abbiamo le stesse dimensioni 
    public static int[][] sommaMatrici(int[][] A, int[][] B){
    int[][] S = new int [A.length][A[0].length];
    
    return S;
    
    }
    */
   // creare 
    public static void main(String [] args){
        Scanner scan= new Scanner(System.in);

        System.out.println("Dammi una N:");
        int n=scan.nextInt();

        System.out.println("Dammi una m:");
        int m=scan.nextInt();

        int [] [] A=chiediMatrice(n,m);
        int [] [] B=chiediMatrice(n,m);
 
        stampaMatrice(A);
        stampaMatrice(B);

       // int [] [] C=sommaMatrice(A,B);
        //stampamatrice(C);
    }
}