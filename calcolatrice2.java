import java.util.*;

public class calcolatrice2{
	static int somma(int n1, int n2){
	return n1 + n2;
	}
	static int differenza(int n1, int n2){
	return n1 - n2;
	}
	static int moltiplicazione(int n1, int n2){
	return n1 * n2;
	}
	static double divisione(double n1, double n2){
	return n1 / n2;
	}
	
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Inserire il primo dato");
	int x = scan.nextInt();
	System.out.println("Inserire il secondo dato");
	int y = scan.nextInt();
	// ??
	System.out.println("Gang!");
	System.out.println(somma(x,y));
	System.out.println(differenza(x,y));
	System.out.println(moltiplicazione(x,y));
	System.out.println(divisione(y,x));

	}
}