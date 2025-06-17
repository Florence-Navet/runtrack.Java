public class Figure {
    protected double x;
    protected double y;

    // Constructeur
    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Méthode pour modifier les deux coordonnées en même temps
    public void setCentre(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Affichage
    public void afficher() {
        System.out.println("Coordonnées du centre : (" + x + ", " + y + ")");
    }
}
