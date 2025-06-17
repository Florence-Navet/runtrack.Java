public class RectangleColore extends Rectangle {
    private int couleur;

    public RectangleColore(double longueur, double largeur, int couleur) {
        super(longueur, largeur); // appel constructeur classe parente
        this.couleur = couleur;
    }
    public int getCouleur() {
        return couleur;
    }
    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }

    public void afficheCercleColore() {
        System.out.println("Longueur : " + getLongueur());
        System.out.println("Largeur : " + getLargeur());
        System.out.println("Couleur : " + getCouleur());
        System.out.println("Surface : " + surface());
    }
}
