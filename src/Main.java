import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java !");

        Scanner clavier = new Scanner(System.in);

        Personne p = new Personne(
                "Patenne",
                "Adeline",
                "15/05/1996",
                "Marseille",
                "Castellane",
                "0611111111"
        );

        p.afficherInfos();



        //InverseNombre.AfficherNombreInverse();
       // Mulplication.AfficherTable();
       // NombresPairs.AfficherNombresPairs();
       // Factorielle.AfficherFactorielle();
       // Age.AfficherAge();
        //Sphere.AfficherCubes();
       // Variables.AppeletVaribales();
      // Prenom.AppelerPrenom();
        //Array.AfficherTableau();
        //Carre.AfficherCarre();
        //Maximum.AfficherMaximum();
      // Moyenne.AfficherMoyenne();
       // Somme.AfficherSomme();

        //clavier.close();
    }


}
