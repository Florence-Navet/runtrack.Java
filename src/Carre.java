import java.util.Scanner;

public class Carre {
    public static void AfficherCarre() {
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez un nombre entier : ");
        int nombre = clavier.nextInt();

        int carre = nombre * nombre;
        System.out.println("Le carré de " + nombre + " est " + carre);


    }
}
