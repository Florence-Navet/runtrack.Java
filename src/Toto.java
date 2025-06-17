public class Toto {
    // variable statique pour compter les instances créées
    static int compteur = 0;

    Toto() {
        compteur = compteur + 1;
    }
}
