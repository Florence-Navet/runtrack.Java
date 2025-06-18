public class Rectangle extends Figure {
    protected double longueur;
    protected double largeur;
    protected double hauteur;

    // Constructeur pour les tests simples (Test 1)
    public Rectangle(double largeur, double hauteur) {
        super(0, 0); // coordonnées par défaut
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.longueur = 0; // non utilisé ici
    }

    // Constructeur complet (Test 3)
    public Rectangle(double x, double y, double longueur, double largeur, double hauteur) {
        super(x, y);
        this.longueur = longueur;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public double surface() {
        return longueur * largeur;
    }

    @Override
    public String toString() {
        return "Rectangle :\n" +
                "largeur = " + largeur + "\n" +
                "hauteur = " + hauteur;
    }
}
