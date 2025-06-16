import java.util.Scanner;

public class InverseNombre {
    public static void AfficherNombreInverse() {
        /*Écrire un programme Java qui demande à l'utilisateur d'entrer un nombre,
puis inverse ce nombre et l'affiche à l'utilisateur. Par exemple : 12345 devient
54321.*/

        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez un nombre entier pour qu'il soit inversé : ");
        int nombre = clavier.nextInt();
        int nombreInverse = 0;

        while (nombre != 0){
            int chiffre = nombre % 10;
            nombreInverse = nombreInverse * 10 + chiffre;
            nombre /= 10;

        }
        System.out.println("Le nombre inversé est : " + nombreInverse);
    }
}










