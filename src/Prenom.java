import java.util.Scanner;

public class Prenom {
    public static void AppelerPrenom() {
        /*Écrire un programme java qui demande un prénom et qui répond « bonjour
        prenom »*/
        Scanner clavier = new Scanner(System.in);

        // Demandez à l'utilisateur d'entrer des données.
        System.out.print("Entrez votre prénom : ");
        String prenom = clavier.nextLine();

        // Affichez les données entrées par l'utilisateur.
        System.out.println("Bonjour " + prenom);



    }
}
