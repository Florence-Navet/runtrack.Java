import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java !");

        Scanner clavier = new Scanner(System.in);
        Variables.AppeletVaribales();
        Prenom.AppelerPrenom();
        Array.AfficherTableau();
        Carre.AfficherCarre();
        clavier.close();
    }


}
