import java.util.Scanner;
public class ifo2 {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Scrivi x");
	double x = scan.nextDouble();
	if (x < 0) {
	x--;
	} else {
	x= Math.sqrt(x);
	
	}
	System.out.println("nuovo x: " + x);
		



}


}