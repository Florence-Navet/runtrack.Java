import java.math.BigInteger;
import java.util.Scanner;

public class Factorielle {
    public static void AfficherFactorielle() {
        /*Écrire un programme Java qui calcule factorielle de 8.*/

        int nombre = 8;
        long resultat = 1;

        for (int i = 1; i <= nombre; i++) {
            resultat *= i;
        }

        System.out.println("La factorielle de " + nombre + " est : " + resultat);

        System.out.println("------------------------------------------");

        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez un entier positif : ");
        int n = clavier.nextInt();

        //long resultat1 = 1;
        BigInteger resultat1 = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            resultat1 = resultat1.multiply(BigInteger.valueOf(i));
        }

        System.out.println("La factorielle de " + n + " est : " + resultat1);


    }


}
