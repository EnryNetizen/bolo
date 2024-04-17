import java.util.Scanner;
public class ifes11 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		System.out.println("Inserire baseMaggiore baseMinore e altezza");
		int baseMaggiore = scan.nextInt();
		int baseMinore = scan.nextInt();
		int altezza = scan.nextInt();
			if (baseMaggiore >= 0 && baseMinore >= 0 && altezza >= 0)
			if (baseMaggiore > baseMinore){
			double area = ((baseMaggiore + baseMinore) * altezza) / 2;
			System.out.println("l'area e': " + area);
			} else { 
				System.out.println("Errore!");
			}

	}
}