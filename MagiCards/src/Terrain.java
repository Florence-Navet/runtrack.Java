public class Terrain extends Carte {
    private char couleur;

    public Terrain(char couleur) {
        super(0);
        this.couleur = couleur;
    }
    @Override
    public void afficher() {
        System.out.println("Terrain - Couleur : " + couleur + ",Coût : "+ cout);
    }

}
