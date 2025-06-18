import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java !");

        System.out.println("--------------TEST CALL HiERARCHIE---------------------");

        System.out.println("Test 1 :");
        Rectangle rect = new Rectangle(12.5, 4.0);
        System.out.println(rect);

        System.out.println("\nTest 2: ");
        RectangleColore rect1 = new RectangleColore(12.5, 4.0, "rouge");
        System.out.println(rect1);

        System.out.println("\nTest 3 :");
        Rectangle rect2 = new RectangleColore(25.0/2, 8.0/2, "rouge");
        System.out.println(rect2);

        System.out.println(rect1.equals(rect2)); // 1.
        System.out.println(rect2.equals(rect1)); // 2.
        System.out.println(rect1.equals(null));  // 3.
        System.out.println(rect.equals(rect1));  // 4.
        System.out.println(rect1.equals(rect));  // 5.



        System.out.println("--------------------cercle---------------------");
        Cercle cer = new Cercle(0,0, 5);
        cer.affiche();


        System.out.println("Le point (2, 6) est dans le cercle ? " + cer.estInterieur(3, 4));
        System.out.println("Le point (7, 1) est dans le cercle ? " + cer.estInterieur(6, 0));

        System.out.println();
        System.out.println("------------creation rectangle----------------------");
        Rectangle rect0 = new Rectangle(5.0, 10.0, 7.0, 4.0, 8);
        System.out.println("Largeur : " + rect.getLargeur());
        System.out.println("Longueur : " + rect.getLongueur());
        System.out.println("Surface : " + rect.surface());

        // Modifier la largeur et la longueur
        rect0.setLargeur(7.5);
        rect0.setLongueur(12.0);


        System.out.println("Nouvelle largeur : " + rect.getLargeur());
        System.out.println("Nouvelle longueur : " + rect.getLongueur());
        System.out.println("Nouvelle surface : " + rect.surface());

        System.out.println();
        System.out.println("------------creation rectangle colore----------------------");

        RectangleColore rec2 = new RectangleColore(2.0, 3.0, 5.0, 4.0, 12, "bleu");
        rec2.afficheRectangleColore();


        Rectangle r3 = new Rectangle(1.0, 2.0, 5.0, 3.0, 15);
        r3.afficher();



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
