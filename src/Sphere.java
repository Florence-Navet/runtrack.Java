import java.util.Scanner;

public class Sphere {
    public static void AfficherCubes() {
        /* Écrire un programme Java qui demande à l'utilisateur de saisir un nombre
           entier n et lui affiche la somme des n premiers cubes. */

        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez un nombre entier n : ");

        int n = clavier.nextInt();
        int somme = 0;

        for (int i = 1; i <= n; i++) {
            somme += i * i * i;
        }

        System.out.println("La somme des " + n + " premiers cubes est : " + somme);


    }
}
