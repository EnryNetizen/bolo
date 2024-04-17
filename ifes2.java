import java.util.Scanner;
public class ifes2 {
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("Inserire una stringa");
String x = scan.nextLine();
System.out.println("Inserisci un numero");
int i = scan.nextInt();
	if (i >= 0 && i < x.length()) {
		char c = x.charAt(i);
			switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				System.out.println(c + " e' una vocale");
				break;
			default:
				System.out.println(c + "e' una vocale");
		}
	} else {
		System.out.println("Errore!");
	} 


}
}