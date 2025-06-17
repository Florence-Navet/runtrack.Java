public class Cercle extends Figure {
    private double rayon;

    // Constructeur
    public Cercle(double x, double y, double rayon) {
        super(x, y);             // appel au constructeur de la classe Figure
        this.rayon = rayon;      // affectation correcte
    }

    // Getter
    public double getRayon() {
        return rayon;
    }

    // Setter
    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    // Surface du cercle
    public double surface() {
        return Math.PI * rayon * rayon;
    }

    // Vérifie si un point est à l'intérieur du cercle
    public boolean estInterieur(double px, double py) {
        double dx = px - x;
        double dy = py - y;
        return (dx * dx + dy * dy) <= (rayon * rayon);
    }

    // Affichage
    public void affiche() {
        System.out.println("Centre : (" + x + ", " + y + ")");
        System.out.println("Rayon : " + rayon);
        System.out.println("Surface : " + surface());
    }
}
