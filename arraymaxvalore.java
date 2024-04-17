import java.util.Scanner;
import java.util.Arrays;
public class arraymaxvalore {
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
	
 	int[] v = {1,30,-4,-5,19,10,-8};
	int max = 0;
	
	for(int i = 0; i < v.length; i++)
		if (v[i] > max)
		max = v[i];
	System.out.println("il max e' " + max);
	/*
	int temp, i;
	int[] a = {-8,30,-4,-5,19,-5,-4,30,1};
	int[] T = new int[a.length];
	for (int i = 0; i < a.length/2; i++){
		temp = a[i];
		a[i] = a[a.length -1 -i];
		a[a.length -1 -i] = temp;
	
	
	
	}
	for (i = 0; i < a.length; i++)
		Systema.out.println(a[i]);
	*/
	// System.out.println(Arrays.toString(a));
	
	


}
}