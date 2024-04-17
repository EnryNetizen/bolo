import java.util.*;

public class sim.1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double numero;
        double sommaQuadrati = 0;
        int n = 0;
        
        do {
            System.out.print("Inserisci dei numeri");
            numero = scanner.nextDouble();

            if (numero != 0) {
                sommaQuadrati += numero * numero;
                n++;
            }
        } while (numero != 0);

        double media = sommaQuadrati / numeroValori;
        System.out.println("La media dei quadrati è: " + media);
    }
}