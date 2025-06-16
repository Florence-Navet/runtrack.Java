import java.util.Scanner;

public class NombresPairs {
    public static void AfficherNombresPairs() {
        /* Écrire un programme Java qui demande à l’utilisateur de saisir un nombre
           entier n et de lui afficher successivement tous les nombres pairs
           qui sont inférieurs ou égaux à n. */

        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez un nombre entier n : ");
        int n = clavier.nextInt();

        System.out.println("Les nombres pairs inférieurs ou égaux à " + n + " sont :");
        for (int i = 0; i <= n; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();

    }
}
