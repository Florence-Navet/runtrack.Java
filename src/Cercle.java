public class Cercle {
    private double x;
    private double y;
    private double rayon;

    //Constructeur
    public Cercle(double x, double y, double rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRayon() {
        return rayon;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
    public double surface () {
        return Math.PI * rayon * rayon;
    }
    public boolean estInterieur (double px, double py) {
        double dx = px - x;
        double dy = py - y;
        return (dx * dx + dy * dy) <= (rayon * rayon);
    }
    // Méthode d'affichage
    public void affiche() {
        System.out.println("Centre : (" + x + ", " + y + ")");
        System.out.println("Rayon : " + rayon);
        System.out.println("Surface : " + surface());
    }


}
