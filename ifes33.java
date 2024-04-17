import java.util.Scanner;
public class ifes33{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
	System.out.println("Inserire una stringa");
	String x = scan.nextLine();
		if(x.charAt(2) != ' ') {
			System.out.println("La parola inizia con la lettera: " + x.charAt(2));
		return;
}
			String k = x.trim();
			int i = x.indexOf(k);
			System.out.println("Stringa originale\"" + x + "\"");
			System.out.println("Senza spazi iniziali: \"" + x.substring(i) + "\"");


}
}


