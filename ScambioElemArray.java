import java.util.Scanner;
import java.util.Arrays;
public class ScambioElemArray {
public static void main(String[] args){
	//assumiamo che l’array abbia 10 elementi
	System.out.println("Inserisci 4 elementi");
	int[] a = new int[4];
	int temp, i;
	Scanner scan = new Scanner(System.in);
	//lettura
	for (i = 0; i < a.length; i++)
	a[i] = scan.nextInt();
	//inversione
	for (i = 0; i <= (a.length -1) / 2; i++) {
	temp = a[i];
	a[i] = a[a.length - 1 - i];
	a[a.length - 1 - i] = temp;
	}
	//stampa
	for (i = 0; i < a.length; i++)
	System.out.println(a[i]);


}
}