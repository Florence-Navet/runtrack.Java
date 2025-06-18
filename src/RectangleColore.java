public class RectangleColore extends Rectangle {
    //private int couleur;
    private String couleur;

    public RectangleColore(double x, double y, double longueur, double largeur, double hauteur, String couleur) {
        super(x, y, longueur, largeur, hauteur); // appel constructeur classe parente
        this.couleur = couleur;
    }
    // Nouveau constructeur pour test 2 (largeur, hauteur, couleur)
    public RectangleColore(double largeur, double hauteur, String couleur) {
        super(largeur, hauteur); // Appelle le constructeur simplifié de Rectangle
        this.couleur = couleur;
    }

    public String getCouleur() {
        return couleur;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void afficheRectangleColore() {
        System.out.println("Longueur : " + getLongueur());
        System.out.println("Largeur : " + getLargeur());
        System.out.println("Couleur : " + getCouleur());
        System.out.println("Surface : " + surface());
    }

    @Override
    public String toString() {
        return super.toString() + "\ncouleur = " + couleur;
    }


}
