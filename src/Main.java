import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java !");

        Scanner clavier = new Scanner(System.in);
        NombresPairs.AfficherNombresPairs();
        Factorielle.AfficherFactorielle();
        Age.AfficherAge();
        Sphere.AfficherCubes();
        Variables.AppeletVaribales();
        Prenom.AppelerPrenom();
        Array.AfficherTableau();
        Carre.AfficherCarre();
        Maximum.AfficherMaximum();
        Moyenne.AfficherMoyenne();
        Somme.AfficherSomme();

        clavier.close();
    }


}
