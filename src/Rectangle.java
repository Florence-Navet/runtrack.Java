public class Rectangle extends Figure{
    private double longueur;
    private double largeur;

    // Constructeur
    public Rectangle(double x, double y, double longueur, double largeur) {
        super(x, y);
        this.longueur = longueur;
        this.largeur = largeur;
    }


    // Getter pour longueur
    public double getLongueur() {
        return longueur;
    }

    // Setter pour longueur
    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    // Getter pour largeur
    public double getLargeur() {
        return largeur;
    }

    // Setter pour largeur
    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    // Méthode pour calculer la surface
    public double surface() {
        return longueur * largeur;
    }
}
