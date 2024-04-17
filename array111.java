import java.util.Scanner;

public class array111 {
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
		System.out.println("Inserisci la lunghezza dell'array");
		int size = scan.nextInt();
		double[] score = new double[size];
		
		for (int k = 0; k < score.length; k++) {
			System.out.println("Inserisci elementi " + k);
			score[k] = scan.nextDouble();

		}
		System.out.println("***");
		for (int i = 0; i < score.length; i++){
		System.out.println(score[i]);
		}
	}
}