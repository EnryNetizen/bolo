import java.util.Scanner;
import java.util.Arrays;
public class array1111 {
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
	int[] X = {1,3,4,5,9,10};
	System.out.println(Arrays.toString(X)); // [1,3,4,5]
	// creo l'array Y
	int[] Y = new int[X.length];
	
	
	for (int i = 0; i < X.length; i++) {
		
	int sommaParziale= 0;
	
	for (int j = 0; j <= i; j++)
		sommaParziale = sommaParziale + X[j];
	Y[i] = sommaParziale;
	

	}
	System.out.println(Arrays.toString(Y));


}



}