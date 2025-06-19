public class Jeu {
    private Carte[] cartes;
    private int nbCartes; // compteur de cartes ajoutées

    public Jeu() {
        cartes = new Carte[10]; // max 10 cartes
        nbCartes = 0;
    }

    public void piocher(Carte carte) {
        if (nbCartes < cartes.length) {
            cartes[nbCartes] = carte;
            nbCartes++;
        } else {
            System.out.println("Le jeu est plein !");
        }
    }

    public void jouer() {
        for (int i = 0; i < cartes.length; i++) {
            if (cartes[i] != null) {
                cartes[i].afficher();
                cartes[i] = null;
                nbCartes--;
                break;
            }
        }
    }


    public void afficher() {
        System.out.println("=== Nouveau Deck===");
        for (Carte carte : cartes) {
            if (carte != null) {
                carte.afficher();
            }
        }
    }
}
