import java.util.Scanner;

public class array33 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserire la lunghezza dell'array");
		int n = scan.nextInt(); 
			int[] A = new int[n];
			for (int i = 0; i < A.length; i++) {
			System.out.println("Inserire in a["+i+"]");
				A[i] = scan.nextInt();
			}
			System.out.println("stampa");
				for ( int i = 0; i < A.length; i++){
					System.out.println(A[i] + " ");
				}	
		
	
	
	
	
	}

}