import java.util.Scanner;
import java.util.Arrays;
public class tutoratoes2 {
public static void main(String[] args ){
Scanner scan = new Scanner(System.in);
System.out.println("Inserisci n elementi e numero d per dividere");
int d = scan.nextInt();
final int N = scan.nextInt();
int[] a = new int[N];
for (int i = 0; i < a.length; i++){
System.out.println("Scrivi il numero nella posizione i = "+ i +" dell'array");
a[i] = scan.nextInt();
}
// controllo divisione
if (a % d == 0) {
for (int i = 0; i < a.length; i++){
	System.out.println("Nella posizione i = " + i +" dell'array è presente il valore: " + a);
}
// spostamento a destra
int valUltimoEle=a[0];
for (int i = 0; i < a.length; i++){
a[i] = a[i+1];

}
a[a.length-1] = valUltimoEle;
for (int i = 0; i < a.length; i++){
System.out.println("Nella posizione i = "+ i +" dell'array è presente il volare: " + a);
}
} else {
System.out.println("Errore!");

}

 /* int[] a = new int[3];
int temp, i;
Scanner scan = new Scanner(System.in);
//lettura
for (i = 0; i < a.length; i++)
a[i] = scan.nextInt();
//spostamento a sinistra
for (i = 0; i <= (a.length - 1) / 2; i++) {
temp = a[i];
a[i] = a[a.length - 1 - i];
a[a.length - 1 - i] = temp;
}
//stampa
for (i = 0; i < a.length; i++)
System.out.println(a[i]);


*/

}
}