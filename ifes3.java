import java.util.Scanner;
public class ifes3 {
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("Inserire una parola con uno spazio iniziale");
String x = scan.nextLine();
	if (x.charAt(0) != ' ') {
		System.out.println("La stringa comincia con: " + x.charAt(0));
		return;


}
	String k = x.trim();
	int i = x.indexOf(k);
	System.out.println("Stringa originale\""+ x +"\"");
	System.out.println("Senza spazi iniziali: \"" + x.substring(i) + "\"");
	
}

}