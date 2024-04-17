import java.util.*;
public class util {
public static void main (String []args){
Scanner scan= new Scanner (System.in);
scan.useLocale(Locale.Us);
double base,altezza,area;

System.out.print("Inserisci la base: ");
base = scan.nextDouble();
altezza = 12.0;
area = base * altezza /2;
System.out.println("area =" + area);
}
}