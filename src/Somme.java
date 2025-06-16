public class Somme {
    public static void AfficherSomme() {
        // Calculer la somme des 100 premiers entiers (de 1 à 100)
        int somme = 0;

        for (int i = 1; i <= 100; i++) {
            somme += i;
        }

        System.out.println("La somme des 100 premiers entiers est : " + somme);
    }
}
