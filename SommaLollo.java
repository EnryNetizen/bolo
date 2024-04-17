import java.util.Arrays;
import java.util.Scanner;
public class SommaLollo {
    public static void stampaMatrice(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                System.out.println(M[i][j] + "\t");
            }
        }
        System.out.println();
    }
    public static int[][] chiediMatrice(int n, int m) {
        Scanner scan = new Scanner(System.in);
        int[][] matrice = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("input");
                matrice[i][j] = (int) scan.nextInt();
            }
        }
        return matrice;
    }
    public static int[][] sommaMatrici(int[][] mA, int[][] mB) {
        int[][] matrice = new int[mA.length][mA[0].length];
        for (int i = 0; i < mA.length; i++) {
            for (int j = 0; j < mA[0].length; j++) {
                matrice[i][j] = mA[i][j] + mB[i][j];
            }
        }
        return matrice;
    }
    public static void main(String[] args) {
        Scanner scanMain = new Scanner(System.in);

        System.out.println("inserire n:");
        int n = scanMain.nextInt();
        System.out.println("inserire m:");
        int m = scanMain.nextInt();
        System.out.println("input matrice");
        int[][] A = chiediMatrice(n, m);
        int[][] B = chiediMatrice(n, m);
        int[][] somma = sommaMatrici(A, B);
        stampaMatrice(somma);
    }
}