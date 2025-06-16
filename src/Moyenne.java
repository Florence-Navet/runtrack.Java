import java.util.Scanner;

public class Moyenne {
    public static void AfficherMoyenne() {

        Scanner clavier = new Scanner(System.in);

        int somme = 0;
        int i = 0;

        System.out.println("Entrez cinq entiers :");

        while (i < 5) {
            somme += clavier.nextInt();
            i++;
        }

        double moyenne = somme / 5.0;

        System.out.println("La moyenne est : " + moyenne);

        clavier.close();
    }
}
