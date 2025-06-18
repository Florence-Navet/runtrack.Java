import java.util.Queue;

public class GestionVehicules {
    public static void main(String[] args) {


        Vehicule voiture1 = new Vehicule("Porsche", 2022, 25000);
        Voiture maVoiture2 = new Voiture(
                "Renault", // marque
                2018,      // année d'achat
                15000.0,   // prix d'achat
                1600,      // cylindrée
                5,         // nombre de portes
                110,       // puissance
                85000      // kilométrage
        );
        System.out.println("=== VOITURE ===");
        //voiture1.afficher();
        System.out.println();
        maVoiture2.calculePrix(2025);
        maVoiture2.afficher();

        Avion avion1 = new Avion("Airbus", 2020, 150000000, "REACTION", 4500);
        Avion rafale = new Avion(
                "Dassault",
                2018,
                75000000,
                "REACTION",
                1200);
        System.out.println("=== AVION ===");
       // avion1.afficher();
        System.out.println("--- AVANT CALCUL ---");
        rafale.afficher();

        rafale.calculePrix(2026);

        System.out.println("--- APRÈS CALCUL ---");
        rafale.afficher();

    }
}
