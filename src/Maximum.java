import java.util.Scanner;

public class Maximum {
    public static void  AfficherMaximum(){
        /*Écrire un programme java qui demande à l’utilisateur de saisir
        successivement trois nombres et de lui afficher le maximum des trois.*/

        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez trois nnombres a, b et C : ");
        int a = clavier.nextInt();
        int b = clavier.nextInt();
        int c = clavier.nextInt();


        int max = a;

        if (b > max) {
            max= b;
        }

        if (c > max) {
            max = c;
        }

        System.out.println("Le maximum des trois nombres est " + max);
    }
}
