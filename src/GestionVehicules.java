import java.util.Queue;

public class GestionVehicules {
    public static void main(String[] args) {


        Vehicule voiture1 = new Vehicule("Porsche", "2022-06-15", 25000);
        System.out.println("=== VOITURE ===");
        voiture1.afficher();

        Avion avion1 = new Avion("Airbus", "2020-03-15", 150000000, "REACTION", 4500);
        System.out.println("=== AVION ===");
        avion1.afficher();
    }
}
