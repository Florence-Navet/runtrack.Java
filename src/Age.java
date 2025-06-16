import java.util.Scanner;

public class Age {
    public static void AfficherAge() {
        /* Écrire un programme Java qui demande à l'utilisateur de saisir son âge
           et lui affiche s'il est mineur (<18 ans) ou majeur (>=18 ans). */

        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez votre âge : ");
        int age = clavier.nextInt();

        if (age < 18) {
            System.out.println("Vous êtes mineur ! Votre âge est de : " + age + " ans.");
        } else {
            System.out.println("Vous êtes majeur ! Vous avez " + age + " ans.");
        }


    }
}
