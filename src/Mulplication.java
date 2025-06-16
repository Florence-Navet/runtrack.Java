import java.util.Scanner;

public class Mulplication {
    public static void  AfficherTable() {
        /* Écrire un programme Java qui demande à l’utilisateur de saisir un nombre
entier n inférieur ou égal à 9 et de lui afficher la table de multiplication de ce
nombre. */
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez un nombre entier (≤ 9) : ");
        int n = clavier.nextInt();

        if (n <= 9) {
            System.out.println("Table de multiplication de " + n + " :");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        } else {
            System.out.println("Erreur : le nombre doit être inférieur ou égal à 9.");
        }




    }
}
