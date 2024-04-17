import java.util.Scanner;
import java.util.Arrays;
public class tutoratoes1 {
public static void main(String[] args ){
Scanner s=new Scanner(System.in);
	 System.out.println("Scrivi un numero intero che rappresenterà la lunghezza del tuo array");
	    final int N= s.nextInt();
	    int a[]=new int[N];
	    for (int i =0; i< a.length; i++){
	    System.out.println("Scrivi il numero nella posizione i = "+ i +" dell'array");
	    a[i]= s.nextInt();
	    }
	    for (int i =0; i<a.length; i++){
	    System.out.println("Nella poszione i = "+ i +" dell'array è presente il valore: "+a[i]);
	    }
	    //spostamento a sinistra
	    int valoreUltimoEle=a[0];
	    for (int i =0; i< a.length-1; i++){
	    a[i]= a[i+1];
	    }
	    a[a.length-1]=valoreUltimoEle;
	    for (int i =0; i<a.length; i++){
	    System.out.println("Nella poszione i = "+ i +" dell'array è presente il valore: "+a[i]);
	    }
	    //inserimento condizionato
	    int aCond[]= new int[N];
	    int n=0;
	    {
	    int i =0;
	    while (i<aCond.length)
	    {
	    System.out.println("Scrivi il numero nella posizione i = "+ i +" dell'array");
	    n= s.nextInt();
	    if(n%N==0){
	        aCond[i]=n;
	        i++;
	    }
	    }
	    }

/*
Scanner scan = new Scanner(System.in);
System.out.println("Inserisci n elementi e numero d per dividere");
int d = scan.nextInt()
final int N = scan.nextInt();
int[] a = new int[N];
for (int i = 0; i < a.length; i++){
System.out.println("Scrivi il numero nella posizione i = "+ i +" dell'array");
a[i] = scan.nextInt();
}
// controllo divisione
if (a % n == 0) {
for (int i = 0; i < a.length; i++){
	System.out.println("Nella posizione i = " + i +" dell'array è presente il valore: " + a);
}
// spostamento a sinistra
int valUltimoEle=a[0];
for (int i = 0; i < a.length; i++){
a[i] = a[i+1];

}
a[a.length-1] = valUltimoEle;
for (int i = 0; i < a.length; i++){
System.out.println("Nella posizione i = "+ i +" dell'array è presente il volare: " + a);
} else {
System.out.println("Errore!");

}

  int[] a = new int[3];
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