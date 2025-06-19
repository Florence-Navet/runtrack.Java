// Classe de base
abstract class Carte {
    protected int cout;

    public Carte(int cout) {
        this.cout = cout;
        System.out.println("Création d'une carte de type " + this.getClass().getSimpleName());
    }

    public abstract void afficher();
}
