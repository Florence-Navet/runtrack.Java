import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java !");

        System.out.println("--------------------cercle---------------------");
        Cercle cer = new Cercle(0,0, 5);
        cer.affiche();


        System.out.println("Le point (2, 6) est dans le cercle ? " + cer.estInterieur(3, 4));
        System.out.println("Le point (7, 1) est dans le cercle ? " + cer.estInterieur(6, 0));

        System.out.println();
        System.out.println("------------creation rectangle----------------------");
        Rectangle rect = new Rectangle(5.0, 10.0);
        System.out.println("Largeur : " + rect.getLargeur());
        System.out.println("Longueur : " + rect.getLongueur());
        System.out.println("Surface : " + rect.surface());

        // Modifier la largeur et la longueur
        rect.setLargeur(7.5);
        rect.setLongueur(12.0);


        System.out.println("Nouvelle largeur : " + rect.getLargeur());
        System.out.println("Nouvelle longueur : " + rect.getLongueur());
        System.out.println("Nouvelle surface : " + rect.surface());


        System.out.println("------------appelle toto----------------------");

        Scanner clavier = new Scanner(System.in);

        Toto t1 = new Toto();
        Toto t2 = new Toto();
        Toto t3 = new Toto();
        System.out.println("Toto:" + Toto.compteur);

        System.out.println("------------Creation personne---------------------");

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
