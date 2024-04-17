import java.util.Scanner
public class if {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("Scrivi x");
	int x = scan.nextInt();
	if (x > 0)
		if (x % 2 == 0)
			System.out.println("Il numero è pari");
		else 
			System.out.println("Il numero è dispari");



}


}